#include <stdio.h>

int main(){

    printf("---FLOAT---\n\n");

    float valor_produto, desconto, porcento, valor_total;

    printf("Digite o valor do produto: ");
    scanf("%f", &valor_produto);

    printf("\nDigite o valor do desconto: ");
    scanf("%f", &desconto);

    porcento = valor_produto * (desconto/100.0);
    valor_total = valor_produto - porcento;

    printf("\nO valor com desconto eh: %f\n\n", valor_total);

    /*-------------------------------------------------------------*/

    printf("---INT---\n\n");

    int valor_produto1, desconto1, valor_total1, porcento1;

    printf("Digite o valor do produto: ");
    scanf("%d", &valor_produto1);

    printf("\nDigite o valor do desconto: ");
    scanf("%d", &desconto1);

    porcento1 = valor_produto1 * (desconto1/100.0);
    valor_total1 = valor_produto1 - porcento1;

    printf("\nO valor com desconto eh: %d\n\n", valor_total1);

    /*-------------------------------------------------------------*/

    printf("---DOUBLE---\n\n");

    double valor_produto2, desconto2, porcento2, valor_total2;

    printf("Digite o valor do produto: ");
    scanf("%lf", &valor_produto2);

    printf("\nDigite o valor do desconto: ");
    scanf("%lf", &desconto2);

    porcento2 = valor_produto2 * (desconto2/100.0);
    valor_total2 = valor_produto2 - porcento2;

    printf("\nO valor com desconto eh: %.2lf", valor_total2);
}