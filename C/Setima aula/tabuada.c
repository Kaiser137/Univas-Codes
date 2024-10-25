#include <stdio.h> 

int main(){
    int x;

    printf("Digite um numero: ");
    scanf("%d", &x);

    for(int i = 1; i <= x; i++){
        for(int z = 0; z <= 10; z++){
            int total = i * z;
            printf("%d x %d = %d\n", i, z, total);
        }
        printf("\n");
    }
}