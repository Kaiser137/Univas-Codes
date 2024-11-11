#include <stdio.h>

    void mostrarPar(int vetores[]){
        for(int i = 0; i < 20; i++){
            if(vetores[i]%2 == 0){
                printf("Esse numero eh par: %d\n", vetores[i]);
            }
        }
    }
    void mostrarImpar(int vetores[]){
        for(int i = 0; i < 20; i++){
            if(vetores[i]%2 != 0){
                printf("Esse numero eh impar: %d\n", vetores[i]);
            }
        }
    }
int main(){
    int vet[20];
    
        for(int i = 0; i < 20; i++){
            printf("Digite o numero: ");
            scanf("%d", &vet[i]);
        }
        mostrarPar(vet);
        mostrarImpar(vet);
}