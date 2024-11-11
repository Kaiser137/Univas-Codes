#include <stdio.h>

int calcMuilti(int vetores[]){
    int multi = 1;
    for(int i = 0; i < 6; i++){
        multi = multi * vetores[i];
    }
    return multi;
}


int main(){
     int vet[6];

    for(int i = 0; i < 6; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }
    printf("A multiplicacao dos produtos eh: %d", calcMuilti(vet));
}