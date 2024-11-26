#include <stdio.h>
#include <string.h>

int compararStrings(const char *str1, const char *str2) {
    while (*str1 && (*str1 == *str2)) { 
        str1++;
        str2++;
    }
    return (*str1 == *str2);
}

int main() {
char string1[100]; 
char string2[100]; 
    printf("Digite a primeira string:\n");
    fgets(string1, sizeof(string1), stdin);
    string1[strcspn(string1, "\n")] = '\0';
    printf("Digite a segunda string:\n");
    fgets(string2, sizeof(string2), stdin);
    string2[strcspn(string2, "\n")] = '\0';
    if (compararStrings(string1, string2)) {
        printf("As strings sao iguais.\n");
    } else {
        printf("As strings sao diferentes.\n");
    }
}