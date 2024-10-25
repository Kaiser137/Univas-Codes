#include <stdio.h>

int main(){
    int numb, div = 2, i = 2, primo = 1;

    printf("Digite um numero: ");
    scanf("%d", &numb);

    while(i <= numb){
        while(div <= i/2){
            if(i % div == 0){
                primo = 0;
                break;
            }
            div++;
        }
        div = 2;
        if(primo == 1){
            printf("O numero %d eh primo!\n", i);
        }
        primo = 1;
        i++;
    }
}