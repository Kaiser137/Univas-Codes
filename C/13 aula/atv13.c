#include <stdio.h>

float obterMedia(int vetor[]){
    float media = 0;
    int soma = 0;
    for(int i = 0; i < 15; i++){
        soma = soma + vetor[i];
    }
    media = soma / 15;
    return media;
}

int main(){
    int vet[15];
    for(int i = 0; i < 15; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    
    printf("A media eh: %.2lf", obterMedia(vet));
}