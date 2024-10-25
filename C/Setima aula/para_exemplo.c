#include <stdio.h>

int main(){
    // Dado um numero digitado pelo usuraio, imprima os numero pares entre 0 e o numero digitado

    int num_digitado;

    printf("Digite um numero: ");
    scanf("%d", &num_digitado);

    for(int i = 0; i <= num_digitado; i++){
        if(i % 2 == 0){
        printf("Numero: %d\n", i);
        }
    }
}