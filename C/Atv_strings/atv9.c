#include <stdio.h>
#include <string.h>
#include <ctype.h> 

int ehPalindromo(char *string) {
    int inicio = 0;
    int fim = strlen(string) - 1;

    while (inicio < fim) {
        while (inicio < fim && (isspace((unsigned char)string[inicio]) || !isalpha((unsigned char)string[inicio]))) {
            inicio++;
        }
        while (inicio < fim && (isspace((unsigned char)string[fim]) || !isalpha((unsigned char)string[fim]))) {
            fim--;
        }
        if (tolower((unsigned char)string[inicio]) != tolower((unsigned char)string[fim])) {
            return 0; 
        }
        inicio++;
        fim--;
    }
    return 1; 
}
int main() {
char string[100];
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    if (ehPalindromo(string)) {
        printf("A string e um palindromo.\n");
    } else {
        printf("A string nao e um palindromo.\n");
    }
}