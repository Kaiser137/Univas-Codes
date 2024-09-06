int BOTAO = 7;
int BOTAO2 = 8;
int LED = 10;
int ESTADOBOTAO = 0;
//Definindo as posições




void setup(){
  pinMode(LED, OUTPUT);
  pinMode(BOTAO, INPUT);
  pinMode(BOTAO2, INPUT);
  //Definindo as suas saidas(OUTPUT) e entradas(INPUT)
}




void loop(){
  ESTADOBOTAO = digitalRead(BOTAO) || digitalRead(BOTAO2);  
  if (ESTADOBOTAO == HIGH) {                    
    digitalWrite(LED, HIGH);                      
  } else{
    digitalWrite(LED, LOW);
  }
  //Definindo a função em execução
}