#include <stdio.h>
//Adiciono mais duas bibliotecas
#include <stdlib.h>
#include <time.h>

int main()
{
    // A função srand() é usada para definir a semente para a geração de números aleatórios
    srand(time(NULL));

    // Gera um número aleatório entre 1 e 10 com a função rand()
    int num_esperado = rand() % 10 + 1;
    int num_digitado;
    int tentativas = 3;

    printf("Tente adivinhar o numero (entre 1 e 10). Voce tem 3 tentativas:\n");
    // aplico a função "for" para a estrutura de repetição
    for (int i = 0; i < tentativas; i++) {
        printf("\nDigite um numero:\n");
        scanf("%d", &num_digitado);

        if (num_esperado == num_digitado) {
            printf("\nParabens, voce acertou!\n");
            break;
        } else if (num_esperado > num_digitado) {
            printf("\nVoce errou! O numero esperado e maior!\n");
        } else if (num_esperado < num_digitado) {
            printf("\nVoce errou! O numero esperado e menor!\n");
        }

        if (i == tentativas - 1) {
            printf("\nSuas tentativas acabaram! O numero esperado era %d.\n", num_esperado);
        }
    }
}
