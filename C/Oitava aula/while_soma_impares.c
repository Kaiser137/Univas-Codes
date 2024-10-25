#include <stdio.h>

int main(){
    int i = 0, num, soma = 0;

    printf("Digite um numero: ");
    scanf("%d", &num);

    while(i <= num){
        if(i % 2 != 0){
            soma = soma + i;
        }
        i++;
    }
    printf("A soma dos impares eh: %d", soma);
}