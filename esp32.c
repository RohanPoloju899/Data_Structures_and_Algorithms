/* esp32
nano blink.ino
arduino-cli compile -u -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32
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
