#include <stdio.h>

int main(){
    int num;

    printf("Digite um numero: ");
    scanf("%d", &num);

    for(int i = 2; i <= num; i++){
        int primo = 1;
        for(int divisor = 2; divisor <= i / 2; divisor++){
            if(i % divisor == 0){
                primo = 0;
                break;
            }
        }
        if(primo == 1){
            printf("O numero %d eh primo!\n", i);
        }
    }
}