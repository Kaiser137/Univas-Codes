#include <stdio.h>

int a, b, c;

int main() {
    printf("Eae meu chapa: ");
    scanf("%d", &a);
    printf("ui: ");
    scanf("%d", &b);
    c = a + b;
    printf("O valor da soma = %d\n", c);
    getchar(); // Pausa a execução
    return 0;
}
