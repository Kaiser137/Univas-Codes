#include <stdio.h>
    const int maior_valor = 30;

    #define MENOR_VALOR 1

    int main(){
        int valores[10];
        int numero_lido, valores_lidos=0;

        while(valores_lidos < 10){
            printf("Digite um numero:\n");
            scanf("%d", &numero_lido);
            if(numero_lido >= MENOR_VALOR && numero_lido <= maior_valor){
            valores[valores_lidos]= numero_lido;
            valores_lidos++;
        }else{
            printf("Valores permitidos sao %d e %d,\n", MENOR_VALOR, maior_valor);
        }
    }
       printf("\nValores inseridos\n");
       for(int i = 0; i < 10; i++){
        printf("Valor %d eh: %d\n", i+1, valores[i]);
       } 
       
    }