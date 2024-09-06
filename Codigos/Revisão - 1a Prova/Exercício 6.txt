// Exercício 6

#include <stdio.h>

int main()
{
    char letra;
    printf("Digite uma letra: \n");
    scanf("%c", &letra);
    
    if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || 
    letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U' ){
        printf("\nA letra %c eh uma vogal!", letra);
    }
    else{
        printf("\nA letra %c eh uma consoante!", letra);
    }
}