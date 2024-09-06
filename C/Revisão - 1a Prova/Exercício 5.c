// Exercício 5

#include <stdio.h>

int main()
{
    int num1, num2;
    printf("Digite o primeiro numero: \n");
    scanf("%d", &num1);
    printf("\nDigite o segundo numero: \n");
    scanf("%d", &num2);
    
    if (num1 > num2){
        printf("\nO numero %d eh maior que o numero %d", num1, num2);
    }
    else if(num1 < num2){
        printf("\nO numero %d eh menor que o numero %d", num1, num2);
    }
    else{
        printf("\nO numero %d eh igual o numero %d", num1, num2);
    }
}