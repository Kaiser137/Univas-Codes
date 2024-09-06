// Exercício 2

#include <stdio.h>

int main()
{
    int num;
    float num_dec, total;
    printf("Digite um numero inteiro: \n");
    scanf("%d", &num);
    printf("Digite um numero decimal: \n");
    scanf("%f", &num_dec);
    total = num + num_dec;
    printf("\n\nO total da soma desses numeros e: %.2lf", total);
}