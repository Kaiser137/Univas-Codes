#include <stdio.h>
#include <string.h>
#include <ctype.h>

void substituirCaractere(char *string, char caractereAntigo, char caractereNovo) {
    while (*string) {
        if (*string == caractereAntigo) {
            *string = caractereNovo; 
        }
        string++; 
    }
}
int main() {
char string[100]; 
char caractereAntigo; 
char caractereNovo;   
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    printf("Digite o caractere a ser substituido:\n");
    scanf(" %c", &caractereAntigo); 
    printf("Digite o caractere substituto:\n");
    scanf(" %c", &caractereNovo); 
    substituirCaractere(string, caractereAntigo, caractereNovo);
    printf("String apos a substituição: '%s'\n", string);
}