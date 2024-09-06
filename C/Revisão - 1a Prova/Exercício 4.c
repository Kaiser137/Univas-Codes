// Exercício 4

#include <stdio.h>

int main()
{
    int id;
    printf("Digite sua idade: \n");
    scanf("%d", &id);
    
    if (id >= 18){
        printf("\nVoce eh maior de idade!");
    }
    else{
        printf("\nVoce eh menor de idade!");
    }
}