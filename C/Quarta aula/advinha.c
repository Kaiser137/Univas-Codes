#include <stdio.h>

int main()
{
    int num_esperado = 7;
    int num_digitado;

    printf("Digite um numero para advinhar:\n");
    scanf("%d", &num_digitado);

    if (num_esperado == num_digitado){
        printf("\nParabens, voce acertou!");
    }
    else if (num_esperado > num_digitado){
        printf("\nVoce errou! Digitou um numero menor que o esperado!");
    }
    else if (num_esperado < num_digitado){
        printf("\nVoce errou! Digitou um numero maior que o esperado!");
    }
}