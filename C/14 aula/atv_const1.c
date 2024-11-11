#include <stdio.h>
    const int maximo_valor = 20;
    const int parada = -1;
    const int min_elementos = 5;

    int main(){
           int valores[10];
        int numero_lido, valores_lidos=0;

        while(valores_lidos < 20){
            printf("Digite um numero(-1 eh para parada):\n");
            scanf("%d", &numero_lido);
            if(numero_lido < maximo_valor && numero_lido > 0){
            valores[valores_lidos]= numero_lido;
            valores_lidos++;
        }else if(valores_lidos < valores[4]){
           printf("Digite no minimo 5 numeros!\n");
        }else{
             printf("\nValores inseridos\n");
       for(int i = 0; i < valores_lidos; i++){
        printf("Valor %d eh: %d\n", i+1, valores[i]);
       } 
            break;
        }
    }
    }