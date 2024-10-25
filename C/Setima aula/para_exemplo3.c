#include <stdio.h>

int main(){

    int num_digitado, soma = 0;

    printf("Digite um numero: ");
    scanf("%d", &num_digitado);

    for(int i = 0; i <= num_digitado; i++){
        if(i % 2 > 0){
            soma = soma + i;
        }
    }

    printf("A soma eh: %d", soma);
}