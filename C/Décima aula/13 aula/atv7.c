#include <stdio.h>

void google(int vetorGoogle[], int numero) {
    int encontrado = 0;
    for(int i = 0; i < 12; i++) {
        if(vetorGoogle[i] == numero) {
            printf("Numero encontrado na posicao: %d\n", i);
            encontrado = 1;
        }
    }
    if(!encontrado) {
        printf("Numero nao encontrado\n");
    }
}

int main() {
    int vet[12], num;

    for(int i = 0; i < 12; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    printf("Qual numero você quer buscar: ");
    scanf("%d", &num);

    google(vet, num);

    return 0;
}
