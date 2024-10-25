#include <stdio.h>

int main(){
    printf("---Tabela ASCII---\n\n");
    printf("---FOR---\n\n");
    for (int i = 1; i <= 255; i++){
        printf("\t%c => %d\n", i, i);
    }

    printf("\n---WHILE---\n\n");
    int i = 1; 
    while(i <= 255){
        printf("\t%c => %d\n", i, i);
        i++;
    }
}