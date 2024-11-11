#include <stdio.h>

int medinha(int vetorMedia[]){
    int soma = 0;
    int media = 0;
    for(int i = 0; i < 8; i++){
        soma = soma + vetorMedia[i];
    }
    media = soma / 8;
    return media;
}

int main(){
    int vet[8];
    int soma = 0;

    for(int i = 0; i < 8; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    printf("O valor da media eh: %d", medinha(vet));
}