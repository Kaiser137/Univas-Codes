#include <stdio.h>

void vetorDistinto(int vetor[]){
    for(int i = 0; i < 15; i++){
        for(int a = i + 1; a < 15; a++){
            if(vetor[i] == vetor[a]){
                vetor[a] = 0; // Elementos duplicados com 0
            }
        }
    }
}

int main(){
    int vetor[15];

    for(int i = 0; i < 15; i++){
        printf("Digite um numero: ");
        scanf("%d", &vetor[i]);
    }

    vetorDistinto(vetor);

    for(int i = 0; i < 15; i++){
        printf("Vetor com numeros iguais removidos: %d\n", vetor[i]);
    }

}