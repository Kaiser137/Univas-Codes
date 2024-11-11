#include <stdio.h>

const int Valor_Maximo = 20;
const int Parada = 0;
const int Valor_Minimo = 10;

int main(){
    int vetor[Valor_Maximo], guarda, contador = 0;
    for(int i = 0; i < Valor_Maximo; i++){
        printf("Digite um numero: ");
        scanf("%d", &guarda);
        if(guarda == Parada && i > Valor_Minimo){
            break;
        }else if(guarda == Parada && i < Valor_Minimo){
            printf("Voce ainda nao digitou a quantidade minima de 10 numeros!\n");
        } else{
            printf("Numero aceito!\n");
            vetor[contador] = guarda;
            contador++;
        }
    }

    for(int i = 0; i < contador; i++){
        printf("Vetor na posicao %d eh: %d\n", i, vetor[i]);
    }
}