#include <stdio.h>

int main(){
    int minutos, segundos;

    printf("Digite o numero de minutos desejado: ");
    scanf("%d", &minutos);

    if(minutos >= 0){
        segundos = minutos * 60;
        printf("\nO numero total de segundos eh: %d", segundos);
    }
    else{
        printf("\nImpossivel de realizar o calculo!");
    }
}