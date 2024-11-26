#include <stdio.h>
#include <string.h>

int main() {
    char string1[30];
    printf("Digite uma string:\n");
    fgets(string1, 30, stdin);
    int indice1 = strcspn(string1, "\n");
    string1[indice1] = '\0'; 
    printf("\nString lida: %s\n", string1);
  
    char string2[30];
    char string3[30];
    printf("Digite a primeira string:\n");
    fgets(string2, 30, stdin);
    int indice2 = strcspn(string2, "\n");
    string2[indice2] = '\0';

    printf("Digite a segunda string:\n");
    fgets(string3, 30, stdin);
    int indice3 = strcspn(string3, "\n");
    string3[indice3] = '\0';

    printf("\nStrings lidas:\n%s\n%s\n", string2, string3);

}