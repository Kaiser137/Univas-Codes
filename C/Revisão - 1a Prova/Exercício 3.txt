// Exercício 3

#include <stdio.h>

int main()
{
    int num;
    printf("Digite um numero e descubra se eh impar ou par: \n");
    scanf("%d", &num);
    
    if (num % 2 == 0){
        printf("\nSeu numero eh par!");
    }
    else{
        printf("\nSeu numero eh impar!");
    }
}