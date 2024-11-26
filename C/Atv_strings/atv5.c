#include <stdio.h>
#include <string.h>
#include <ctype.h>

void converterParaMaiusculas(char *string) {
    for (int i = 0; string[i] != '\0'; i++) {
        string[i] = toupper((unsigned char)string[i]);
    }
}
void converterParaMinusculas(char *string) {
    for (int i = 0; string[i] != '\0'; i++) {
        string[i] = tolower((unsigned char)string[i]); 
    }
}

int main() {
char string[100];
int escolha;
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    printf("Escolha uma opção:\n");
    printf("1. Converter para maiusculas\n");
    printf("2. Converter para minusculas\n");
    printf("Digite sua escolha (1 ou 2): ");
    scanf("%d", &escolha);
    if (escolha == 1) {
        converterParaMaiusculas(string);
        printf("String em maiusculas: %s\n", string);
    } else if (escolha == 2) {
        converterParaMinusculas(string);
        printf("String em minusculas: %s\n", string);
    } else {
        printf("Escolha invalida.\n");
    }
}