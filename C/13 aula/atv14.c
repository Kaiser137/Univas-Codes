#include <stdio.h>

void rotacionar(int vetor[]){
    int numero = vetor[11];
    for(int i = 11; i > 0; i--){
        vetor[i] = vetor[i - 1];
    }
    
    vetor[0] = numero;
    
    for(int i = 0; i < 12; i++){
        printf("Numero na posicao %d eh %d\n", i, vetor[i]);
    }
}

int main(){
    int vet[12];
    for(int i = 0; i < 12; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    rotacionar(vet);
}