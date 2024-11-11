#include <stdio.h>

int retornaPositivo(int vetores[]){
    int contador = 0;
    for(int i = 0; i < 10; i++){
           if(vetores[i] >= 0){
            contador++;
           }
        }
        return contador;
}
int retornaNegativos(int vetores[]){
    int contador = 0;
    for(int i = 0; i < 10; i++){
           if(vetores[i] < 0){
            contador++;
           }

        }
        return contador;
}
int main(){
    int vet[10];

        for(int i = 0; i < 10; i++){
            printf("Digite um numero, positivo ou negativo: ");
            scanf("%d", &vet[i]);
        }
    printf("Os numeros positivos convem em: %d\n", retornaPositivo(vet));
    printf("Os numeros negativos convem em: %d", retornaNegativos(vet));
}