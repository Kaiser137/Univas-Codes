#include <stdio.h>

int main(){
    int i = 0, num;

    printf("Digite um numero: ");
    scanf("%d", &num);

    while(i <= num){
        if(i % 2 == 0){
        printf("Numero: %d\n", i);
        }
        i++;
    }
}