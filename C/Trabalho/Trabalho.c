#include <stdio.h>

int main() {
    int operacoes;
    float numb, result;
    
    printf("Escolha uma opcao para operacao: \n");
    printf("1 = de km para milhas\n2 = de Celsius para Fahrenheit\n3 = de Km/h para m/s\n");
    scanf("%d", &operacoes);

    if (operacoes == 1) {
        printf("Digite um numero em km: ");
        scanf("%f", &numb);
        result = numb * 0.6;
        printf("O resultado em milhas e: %.2f\n", result);
    } else if (operacoes == 2) {
        printf("Digite um numero em Celsius: ");
        scanf("%f", &numb);
        result = (numb * 1.8) + 32;
        printf("O resultado em Fahrenheit e: %.2f\n", result);
    } else if (operacoes == 3) {
        printf("Digite um numero em km/h: ");
        scanf("%f", &numb);
        result = numb * 1000;
        printf("O resultado em m/s e: %.2f\n", result);
    } else if (operacoes == 4) {
        printf("Saindo...\n");
    } else {
        printf("Opcao invalida\n");
    }
}
