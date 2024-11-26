#include <stdio.h>
#include <string.h>

#define MAX_PALAVRAS 100 
#define TAM_PALAVRA 50   

int main() {
    char frase[500]; 
    char *palavras[MAX_PALAVRAS]; 
    int i = 0;
    printf("Digite uma frase:\n");
    fgets(frase, sizeof(frase), stdin);
    frase[strcspn(frase, "\n")] = '\0';
    char *token = strtok(frase, " "); 
    while (token != NULL && i < MAX_PALAVRAS) {
        palavras[i] = token; 
        i++;
        token = strtok(NULL, " "); 
    }
    printf("As palavras na frase sao:\n");
    for (int j = 0; j < i; j++) {
        printf("%s\n", palavras[j]);
    }
}