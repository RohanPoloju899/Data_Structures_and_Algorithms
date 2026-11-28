/* esp32
nano blink.ino
arduino-cli compile -u -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32
arduino-cli upload -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32 .
arduino-cli monitor -p /dev/ttyUSB0 -c baudrate=115200


# ESP32 NodeMCU DevKit V1 – Technical Specifications

## 1. Board Configuration
- **Board:** ESP32 NodeMCU DevKit V1
- **Serial Port:** `/dev/ttyUSB0`
- **Upload Speed:** 115200 baud
- **CPU Frequency:** 240 MHz
- **Flash Frequency:** 80 MHz
- **Flash Size:** 4 MB

## 2. Chip Information
- **SoC:** ESP32-D0WD-V3
- **Chip Revision:** 3.1
- **Architecture:** 32-bit Xtensa LX6
- **CPU Cores:** Dual-core
- **Maximum Clock Speed:** 240 MHz
- **Crystal Frequency:** 40 MHz

## 3. Memory Specifications
- **Internal SRAM:** 520 KB
- **ROM:** 448 KB
- **RTC SRAM:** 16 KB
- **Flash Memory:** 4 MB (Verified)
- **PSRAM:** Not integrated

## 4. Connectivity
- **Wi-Fi:** 2.4 GHz (IEEE 802.11 b/g/n)
- **Wi-Fi Theoretical Rate:** Up to 150 Mbps
- **Bluetooth:** Classic Bluetooth + BLE 4.2
- **MAC Address:** `68:09:47:9E:3F:F0`

## 5. Hardware Peripherals

| Peripheral | Specification |
|---|---|
| GPIO | 34 programmable chip GPIOs |
| ADC | 12-bit, up to 18 channels |
| DAC | 2 × 8-bit |
| Touch Sensors | 10 |
| UART | 3 |
| SPI | 4 |
| I2C | 2 |
| I2S | 2 |
| LED PWM | Up to 16 channels |

## 6. Electrical Specifications
- **Flash Manufacturer:** C4
- **Flash Voltage:** 3.3 V

## 7. Project Usage
**Current Project:** NFC-Based Security and Access Control System

**NFC Module:** PN532 RFID/NFC V3

**Development Interface:** Arduino CLI / ESP32 Arduino Core

**Communication:** SPI / I2C / UART (depending on PN532 configuration)
*/

//led program    
void setup()
{
    Serial.begin(115200);
    Serial.println("ESP32 started successfully!");
}

void loop()
{
    Serial.println("ESP32 is working!");
    delay(1000);
}

// led + oled program
/* esp32 display program 
arduino-cli upload -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32 .
arduino-cli upload -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32 .
arduino-cli compile --fqbn esp32:esp32:esp32 .
OLED pin	ESP32 pin
GND	GND
VCC	3V3
SCL	GPIO 22
SDA	GPIO 21

LED / Component	Connect to
LED long leg (+ Anode)	GPIO 2 through 220 Ω resistor
LED short leg (− Cathode)	GND
*/
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SH110X.h>

#define LED 2

Adafruit_SH1106G display(128, 64, &Wire, -1);

void setup()
{
    pinMode(LED, OUTPUT);

    Wire.begin(21, 22);

    display.begin(0x3C, true);
    display.clearDisplay();
    display.setTextSize(2);
    display.setTextColor(SH110X_WHITE);
}

void loop()
{
    digitalWrite(LED, HIGH);

    display.clearDisplay();
    display.setCursor(15, 20);
    display.println("LED ON");
    display.display();

    delay(1000);

    digitalWrite(LED, LOW);

    display.clearDisplay();
    display.setCursor(15, 20);
    display.println("LED OFF");
    display.display();

    delay(1000);
}

//pn532 program
//arduino-cli monitor -p /dev/ttyUSB0 -c baudrate=115200


#include <Wire.h>
#include <Adafruit_PN532.h>

#define SDA_PIN 21
#define SCL_PIN 22

Adafruit_PN532 nfc(-1, -1, &Wire);

void setup()
{
    Serial.begin(115200);

    Wire.begin(SDA_PIN, SCL_PIN);

    Serial.println("Starting PN532...");

    nfc.begin();

    uint32_t version = nfc.getFirmwareVersion();

    if (!version)
    {
        Serial.println("PN532 not detected!");
        while (1);
    }

    Serial.println("PN532 detected!");

    nfc.SAMConfig();

    Serial.println("Ready! Tap your NFC card.");
}

void loop()
{
    uint8_t uid[7];
    uint8_t uidLength;

    bool success = nfc.readPassiveTargetID(
        PN532_MIFARE_ISO14443A,
        uid,
        &uidLength
    );

    if (success)
    {
        Serial.println("\nCard detected!");

        Serial.print("Card UID: ");

        for (uint8_t i = 0; i < uidLength; i++)
        {
            if (uid[i] < 0x10)
                Serial.print("0");

            Serial.print(uid[i], HEX);
            Serial.print(" ");
        }

        Serial.println();
        Serial.println("--------------------");

        delay(1500);
    }
}

//nfc + display
/*Module pin	ESP32
PN532 VCC	3V3
PN532 GND	GND
PN532 SDA	GPIO 21
PN532 SCL	GPIO 22
PN532 IRQ	GPIO 4
PN532 RSTO	Not connected
OLED VCC	3V3
OLED GND	GND
OLED SDA	GPIO 21
OLED SCL	GPIO 22*/


#include <Wire.h>
#include <Adafruit_PN532.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SH110X.h>

#define PN532_IRQ 4

// -1 means no hardware reset pin
Adafruit_PN532 nfc(PN532_IRQ, -1, &Wire);

Adafruit_SH1106G display(128, 64, &Wire, -1);

void setup()
{
    Serial.begin(115200);

    Wire.begin(21, 22);

    display.begin(0x3C, true);
    display.clearDisplay();
    display.setTextColor(SH110X_WHITE);
    display.setTextSize(1);
    display.setCursor(0, 10);
    display.println("NFC SYSTEM");
    display.println("Initializing...");
    display.display();

    nfc.begin();

    uint32_t version = nfc.getFirmwareVersion();

    if (!version)
    {
        Serial.println("PN532 NOT FOUND");

        display.clearDisplay();
        display.setCursor(0, 10);
        display.println("PN532 NOT FOUND");
        display.display();

        while (1);
    }

    nfc.SAMConfig();

    Serial.println("NFC READY");

    display.clearDisplay();
    display.setCursor(0, 10);
    display.println("READY");
    display.println("TAP YOUR CARD");
    display.display();
}

void loop()
{
    uint8_t uid[7];
    uint8_t uidLength;

    bool success = nfc.readPassiveTargetID(
        PN532_MIFARE_ISO14443A,
        uid,
        &uidLength,
        100
    );

    if (success)
    {
        display.clearDisplay();
        display.setCursor(0, 0);

        display.println("CARD DETECTED");
        display.println("CARD UID:");

        Serial.print("Card UID: ");

        for (int i = 0; i < uidLength; i++)
        {
            if (uid[i] < 0x10)
                Serial.print("0");

            Serial.print(uid[i], HEX);

            display.print(uid[i] < 0x10 ? "0" : "");
            display.print(uid[i], HEX);
            display.print(" ");
        }

        Serial.println();
        display.display();

        delay(1500);

        display.clearDisplay();
        display.setCursor(0, 10);
        display.println("READY");
        display.println("TAP NEXT CARD");
        display.display();
    }
}



