#include <stdio.h>

int main(){
   int num, i = 0;//inicio
      printf("Digite um numero: ");
      scanf("%d",&num);

   while(i <= num/*fim*/){
      if(i % 2 == 0){
         printf("Os numeros pares são: %d", i);
      }
      i = i + 1;
   }
}