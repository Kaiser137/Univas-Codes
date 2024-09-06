#include <stdio.h>

int main(){
    int num = 0;

    // laços de repetição
    printf("Digite um numero: \n");
    scanf("%d", &num);

    // for(/* condições de passo e parada */){
    //     /* código que vai ser executado */
    // }

    for (int i = 1; i <= num; i++){
        printf("%d\n", i);
    }
}