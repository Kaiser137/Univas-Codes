#include <stdio.h>

int main(){
    int x = 1, z = 0, total;

    while(x <= 5){
        while (z <= 10){
            total = x * z;
            printf("%d x %d = %d\n", x, z, total);
            z++;
        }
        z = 0;
        printf("\n");
        x++;
    }
}