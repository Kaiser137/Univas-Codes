const int pinoLDR = A5;
float LUMINUS = 0;
const int LED = 10;
void setup() {


pinMode(pinoLDR, INPUT);
Serial.begin(9600);
pinMode(LED, OUTPUT);
 
}
void loop() {


LUMINUS = (analogRead(pinoLDR));
Serial.print("LDR =");
Serial.println(LUMINUS);
delay(1000);


 if(LUMINUS > 380){
digitalWrite(LED, HIGH);
 }
 else{
digitalWrite(LED, LOW);
 }
}