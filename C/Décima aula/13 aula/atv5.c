#include <stdio.h>
#include <limits.h>

int menor(int vetorMenor[]){
    int comparador = INT_MAX;
    for(int i = 0; i < 15; i++){
        if(vetorMenor[i] < comparador){
            comparador = vetorMenor[i];
        }
    }
    return comparador;
}

int maior(int vetorMaior[]){
    int comparador = INT_MIN;
    for(int i = 0; i < 15; i++){
        if(vetorMaior[i] > comparador){
            comparador = vetorMaior[i];
        }
    }
    return comparador;
}

int main(){
    int vet[15];

        for(int i = 0; i < 15; i++){
            printf("Digite o numero: ");
            scanf("%d", &vet[i]);
        }

    printf("O menor eh: %d\n", menor(vet));
    printf("O maior eh: %d", maior(vet));
    
}