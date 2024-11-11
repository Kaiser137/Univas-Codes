#include "Servo.h" // Carrega a biblioteca do servo


Servo servo1; // Cria um Objeto Servo


void setup() {
  Serial.begin(9600); // Inicializa a comunicação serial
  servo1.attach(5); // Define o Servo ao Pin5
}


void loop() {
  int angulo = analogRead(0); // Lê o valor do Potenciômetro
  angulo = map(angulo, 0, 1023, 0, 180); // Converte a entrada de 0-1024 para 0 a 180 graus
  servo1.write(angulo); // Repassa o ângulo ao Servo
  delay(15); // Delay de 15ms para o Servo alcançar a posição
  Serial.print("Ângulo: "); // Imprime o texto "Ângulo: "
  Serial.println(angulo); // Imprime o valor do ângulo
}