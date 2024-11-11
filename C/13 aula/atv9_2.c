#include <stdio.h>

int produto(int vetor[]){
    int total = 1;
    for(int i = 0; i < 6; i++){
        int total = total * vetor[i];
        printf("uau %d\n", total);
    }
    
    return total;
}

int main(){
    int vet[6];
    
    for(int i = 0; i < 6; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    
    printf("O resultado da multiplicação eh: %d", produto(vet));
}