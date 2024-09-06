#include <stdio.h>

int main (){
    int numero;

    printf("Digite um numero: \n");
    scanf("%d", &numero);

    printf("O numero digitado foi: %d\n\n\n", numero);
    
    /*------------------------------------------------*/

    int ano_nascimento, idade, ano_atual;

    ano_atual = 2024;

    printf("Digite o ano do seu nascimento: \n");
    scanf("%d", &ano_nascimento);

    idade = ano_atual - ano_nascimento;

    printf("Sua idade eh: %d", idade);
}