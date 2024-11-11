#include <stdio.h>

void inverteNum(int vetores[], int vetInvertido[]){
    for(int i = 0; i < 20; i++){
        vetInvertido[i] = vetores[19-i];
    }
}

int main(){
     int vet[20];
     int vetInvertido[20];

    for(int i = 0; i < 20; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    inverteNum(vet, vetInvertido);
    for(int i = 0; i < 20; i++){
        printf("%d\n", vetInvertido[i]);
    }
}