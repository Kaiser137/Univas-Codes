#include <stdio.h>

int sominha(int vetorSoma[]){
    int soma = 0;
    for(int i = 0; i < 5; i++){
        soma = soma + vetorSoma[i];
        
    }
    return soma;
}

int main(){
    int vet[5];
    int soma = 0;

    for(int i = 0; i < 5; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    printf("O valor da soma eh: %d", sominha(vet));
}