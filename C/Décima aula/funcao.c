#include <stdio.h>

// funcao possui 3 partes principais
// retorno, nome, parametros
// quando a função não retorna, usamos void

// somar inteiros
int somarinteiros(int n1, int n2){
    return n1 + n2;
}

// somar decimais
float somardecimais(float n1, float n2){
    return n1 + n2;
}

int main(){
    printf("%d\n", somarinteiros(10,15));

    // int soma = somarinteiros(10, 15);
    // printf("%d", soma);

    printf("%f", somardecimais(10.58,15.30));

    // float soma = somardecimais(10, 15);
    // printf("%d", soma);
}

