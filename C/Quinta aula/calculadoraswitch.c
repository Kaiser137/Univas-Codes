#include <stdio.h>

int main(){
    int n1, n2, total;
    char variavel;

    printf("Bem vindo a calculadora!\n");
    printf("Digite o primeiro numero: ");
    scanf("%d", &n1);
    printf("Digite a operacao desejada: \n");
    printf("+ para soma\n");
    printf("- para subtracao\n");
    printf("/ para divisao\n");
    printf("* para multiplicacao\n");
    scanf(" %c", &variavel);

    if (variavel != '+' && variavel != '-' && variavel != '/' && variavel != '*'){
        printf("Opcao Invalida!");
    }
    else {
        printf("\nDigite o segundo numero:\n");
        scanf("%d", &n2);

        switch (variavel)
        {
        case '+' : total = n1 + n2;
            printf("O resultado da soma eh: %d", total);
            break;
        case '-' : total = n1 - n2;
            printf("O resultado da subtracao eh: %d", total);
            break;
        case '/' : total = n1 / n2;
            printf("O resultado da divisao eh: %d", total);
            break;
        case '*' : total = n1 * n2;
            printf("O resultado da multiplicacao eh: %d", total);
            break;
        }
    }
}
