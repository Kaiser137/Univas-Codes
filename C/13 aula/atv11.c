#include <stdio.h>

int removeRepetido(int vetores[], int tamanho, int resultado[]) {
    int k = 0;
    for (int i = 0; i < tamanho; i++) {
        int repetido = 0;
        for (int j = 0; j < k; j++) {
            if (vetores[i] == resultado[j]) {
                repetido = 1;
                break;
            }
        }
        if (!repetido) {
            resultado[k++] = vetores[i];
        }
    }
    return k; // Retorna o novo tamanho do vetor sem repetidos
}

int main() {
    int vet[15];
    int resultado[15];
    int novoTamanho;

    for (int i = 0; i < 15; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    novoTamanho = removeRepetido(vet, 15, resultado);

    printf("Vetor sem repetidos: ");
    for (int i = 0; i < novoTamanho; i++) {
        printf("%d ", resultado[i]);
    }
    printf("\n");

    return 0;
}