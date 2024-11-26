#include <stdio.h>
#include <string.h> 

void inverterString(char *string) {
int i, j;
char temp;
int len = strlen(string); 
    for (i = 0, j = len - 1; i < j; i++, j--) {
        temp = string[i];
        string[i] = string[j];
        string[j] = temp;
    }
}
int main() {
    char string[100]; 
    printf("Digite uma string:\n");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    inverterString(string);
    printf("String invertida: %s\n", string);
}