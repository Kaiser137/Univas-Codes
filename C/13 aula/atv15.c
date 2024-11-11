#include <stdio.h>

void somarVetores(int vetor1[], int vetor2[]){
    int vetorResposta[10];
    for(int i = 0; i < 10; i++){
        vetorResposta[i] = vetor1[i] + vetor2[i];
    }
    
    for(int i = 0; i < 10; i++){
        printf("Soma de vetor na posicao %d, vetor 1 = %d + vetor 2 = %d == %d\n", i, vetor1[i], vetor2[i], vetorResposta[i]);
    }
}

int main(){
    int vet1[10], vet2[10];
    printf("Vetor 1\n");
    for(int i = 0; i < 10; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet1[i]);
    }
    printf("Vetor 2\n");
    for(int i = 0; i < 10; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet2[i]);
    }
    
    somarVetores(vet1, vet2);
}