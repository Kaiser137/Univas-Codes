#include <stdio.h>

int main(){

    int valor;

    printf("Digite um numero maior que zero: ");
    scanf("%d", &valor);

    if (valor > 0){
        printf("Voce acertou\n\n");
        printf("O resultado da comparacao eh: %d", valor > 0);
    }
    else{
        printf("Voce errou!\n\n");
        printf("O resultado da comparacao eh: %d", valor = 0);
    }
}