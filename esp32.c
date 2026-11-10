/* esp32
nano blink.ino
arduino-cli compile -u -p /dev/ttyUSB0 --fqbn esp32:esp32:esp32
arduino-cli monitor -p /dev/ttyUSB0 -c baudrate=115200
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
