#include <stdio.h>
#include <string.h>

int contarOcorrencias(char *string, char caractere) {
    int contador = 0; 
    while (*string) {
        if (*string == caractere) {
            contador++; 
        }
        string++; 
    }

    return contador; 
}
int main() {
char string[100]; 
char caractere;  
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    printf("Digite um caractere para contar suas ocorrencias:\n");
    scanf(" %c", &caractere); 
    int ocorrencias = contarOcorrencias(string, caractere);
    printf("O caractere '%c' aparece %d vez(es) na string.\n", caractere, ocorrencias);
}