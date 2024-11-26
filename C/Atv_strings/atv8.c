#include <stdio.h>
#include <string.h>
#include <ctype.h>

void removerEspacos(char *string) {
char *inicio = string;
char *fim = string + strlen(string) - 1;
    while (isspace((unsigned char)*inicio)) {
        inicio++;
    }
    while (fim > inicio && isspace((unsigned char)*fim)) {
        fim--;
    }
    *(fim + 1) = '\0';
    if (inicio != string) {
        memmove(string, inicio, (fim - inicio + 2) * sizeof(char)); 
    }
}

int main() {
char string[100];
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    removerEspacos(string);
    printf("String sem espacos em branco no inicio e no final: '%s'\n", string);
}