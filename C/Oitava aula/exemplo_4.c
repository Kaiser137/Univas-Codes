#include <stdio.h>

int main(){
   int i = 1, j = 0, tab = 0;

   while(i <= 5){
    while(j <= 10)
    {
       tab = j * i;
       printf("%d x %d = %d\n",i,j,tab);
       j++;
    }
    j = 0;
      i++;
      printf("\n");
   }
}