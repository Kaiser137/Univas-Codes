#include <stdio.h>

void printaNum(int vetFuncao[]){
    for(int i = 0; i < 10; i++){
        printf("Numero na posição %d eh %d!\n", i, vetFuncao[i]);
    }
}
int main(){
    int vet[10];

    for(int i = 0; i < 10; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    printaNum(vet);
}