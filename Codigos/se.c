#include <stdio.h>

int main()
{
    int num1, num2;

    printf("Digite um número: ");
    scanf("%d", &num1);
    printf("\nDigite o segundo numero: ");
    scanf("%d", &num2);

    printf("\nO Resultado da == eh: %d", num1 == num2);
    printf("\nO Resultado da > eh: %d", num1 > num2);
    printf("\nO Resultado da < eh: %d", num1 < num2);
    printf("\nO Resultado da >= eh: %d", num1 >= num2);
    printf("\nO Resultado da <= eh: %d", num1 <= num2);
    printf("\nO Resultado da != eh: %d", num1 != num2);
}