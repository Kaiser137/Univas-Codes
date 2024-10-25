#include <stdio.h>

int main(){
    int idade[43];

    int idade_lida = 0;

    for(int i = 0; i <= 3; i++){
        printf("Digite uma idade: ");
        scanf("%d", &idade_lida);

        idade[i] = idade_lida;
    }

    for(int i = 0; i <= 3; i++){
        printf("\nIdade do aluno %d: %d", i, idade[i]);
    }
}