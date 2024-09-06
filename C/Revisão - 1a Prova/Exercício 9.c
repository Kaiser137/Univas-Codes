// Exercício 9

#include <stdio.h>

int main()
{
    int num;
    float num_dec;
    char letra;
    printf("\nDigite um numero: \n");
    scanf("%d", &num);
    printf("\nDigite um numero decimal: \n");
    scanf("%f", &num_dec);
    printf("\nDigite uma letra: \n");
    scanf(" %c", &letra);
    
    printf("Voce digitou o numero %d, o numero decimal %.2lf e a letra %c", num, num_dec, letra);

}