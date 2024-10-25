#include <stdio.h>

int main(){
    int soma = 0, num, i = 0;

    printf("Digite um numero: ");
    scanf("%d", &num);

    while(i <= num){
        soma = soma + i;
        i++;
    }

    printf("A soma dos numeros naturais eh: %d", soma);
}