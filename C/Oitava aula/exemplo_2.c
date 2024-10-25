#include <stdio.h>

int main(){
   int num, soma = 0, i = 0;

   printf("Digite um numero: ");
   scanf("%d", &num);

   while(i <= num){
      soma = soma + i;
      i++;
   }
   printf("A soma eh: %d", soma);
}