// Exercício 8

#include <stdio.h>

int main()
{
    int num1, num2, total;
    printf("Digite o primeiro numero: \n");
    scanf("%d", &num1);
    printf("Digite o segundo numero: \n");
    scanf("%d", &num2);
    
    if (num1 > num2){
        total = num1 % num2;
        if (total == 0){
            printf("Esses numeros sao multiplos entre si!");
        }
        else{
            printf("Esses numeros nao sao multiplos entre si!");
        }
    }
    else if (num1 < num2){
        total = num2 % num1;
        if (total == 0){
            printf("Esses numeros sao multiplos entre si!");
        }
        else{
            printf("Esses numeros nao sao multiplos entre si!");
        }
    }
    else{
        printf("Esses numeros sao multiplos entre si!");
    }
}