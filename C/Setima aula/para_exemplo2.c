#include <stdio.h>

int main(){
    // Dado um numero digitado pelo usuraio, imprima a soma dos numeros naturais entre 0 e o numero digitado

    int num_digitado, soma = 0;

    printf("Digite um numero: ");
    scanf("%d", &num_digitado);

    for(int i = 0; i <= num_digitado; i++){
        soma = soma + i;
    }

    printf("A soma eh: %d", soma);
}