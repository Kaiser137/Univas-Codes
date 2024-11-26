#include <stdio.h>
#include <string.h>


void concatenarStrings(char *destino, const char *origem) {
    while (*destino) {
        destino++;
    }
    while ((*destino++ = *origem++));
}

int main() {
char string1[50]; 
char string2[50]; 
char resultado[100]; 
 printf("Digite a primeira string:\n");
    fgets(string1, sizeof(string1), stdin);
    string1[strcspn(string1, "\n")] = '\0';
    printf("Digite a segunda string:\n");
    fgets(string2, sizeof(string2), stdin);
    string2[strcspn(string2, "\n")] = '\0';
    strcpy(resultado, string1);
    concatenarStrings(resultado, string2);
    printf("\nResultado da concatenacao:\n%s\n", resultado);

}