#include <Wire.h>

void setup(){
	Wire.begin(21,22);
	
}
void loop(){
	Wire.beginTransmission(0x3C);
	Wire.write(val);
	Wire.endTransmission();
	val++;
	if(val==64){
		val=0;
	}
	delay(500);
}
