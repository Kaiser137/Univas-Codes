#include <stdio.h>

void inverter(int vetor[], int vetorInverso[]){
    for(int i = 0; i < 20; i++){
        vetorInverso[i] = vetor[19 - i];
    }
}

int main(){
    int vet[20];
    int vetInverso[20]; 

    for(int i = 0; i < 20; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    inverter(vet, vetInverso);

    for(int i = 0; i < 20; i++){
        printf("O numero na posicao %d era %d e agora eh: %d\n", i, vet[i], vetInverso[i]);
    }
}
