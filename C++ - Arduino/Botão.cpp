int BOTAO = 7;
int LED = 10;
int ESTADOBOTAO = 0;


void setup() {
  pinMode(LED, OUTPUT);
  pinMode(BOTAO, INPUT);
}


void loop() {
  ESTADOBOTAO = digitalRead(BOTAO);  
  if (ESTADOBOTAO == HIGH) {                    
    digitalWrite(LED, HIGH);                      
  } else {
    digitalWrite(LED, LOW);
  }
}