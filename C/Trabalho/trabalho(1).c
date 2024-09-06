#include <stdio.h>

// Cezar Vitor Leite Junior - Trabalho

int main(){
    int operacao, num;
    float result;

    printf("Escolha uma opção de conversão de unidades: \n\n");
    printf("1. KM para milha\n2. Celsius para Farenheit\n3. KM/S para M/S\n4. Sair\n\n");
    scanf("%d", &operacao);

    if(operacao == 1){
        printf("\nDigite um número: ");
        scanf("%d", &num);
        result = num * 0.6;

        printf("\n\nO resultado da conversao eh: %.2f", result);
    }
    else if(operacao == 2){
        printf("\nDigite um número: ");
        scanf("%d", &num);
        result = (num * 1.8) + 32;

        printf("\n\nO resultado da conversao eh: %.2f", result);
    }
    else if(operacao == 3){
        printf("\nDigite um número: ");
        scanf("%d", &num);
        result = num * 1000;

        printf("\n\nO resultado da conversao eh: %.2f", result);
    }
    else if (operacao == 4){
        printf("\nTchau!");
    }
    else{
        printf("\nOperação invalida!");
    }
}