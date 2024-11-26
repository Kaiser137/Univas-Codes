#include <stdio.h>
#include <string.h>

int calcularComprimento(const char *string) {
    int comprimento = 0;
    while (*string) { 
        comprimento++;
        string++; 
    }
    return comprimento;
}

int main() {
    char string[100]; 
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    int comprimento = calcularComprimento(string);
    printf("O comprimento da string eh: %d\n", comprimento);
}