#include <stdio.h>

int main(){
    int opcaoDigitada;

    printf("Menu de Opcoes\n");
    printf("Opcao 1\n");
    printf("opcao 2\n");
    printf("Opcao 3\n");

    scanf("%d", &opcaoDigitada);

    // if (opcaoDigitada == 1){
    //     printf("Usuario escolheu a opcao 1!");
    // }
    // else if(opcaoDigitada == 2){
    //     printf("Usuario escolheu a opcao 2!");
    // }
    // else if(opcaoDigitada == 3){
    //     printf("Usuario escolheu a opcao 3!");
    // }
    // else{
    //     printf("Alternativa invalida!");
    // }

    // switch (/* expressão */)
    // {
    // case /* constante */ : /* Instruções */
    //     /* code */
    //     break;
    
    // default: /* instruções */
    //     break;
    // }

    switch (opcaoDigitada)
    {
    case 1 : printf("Usuario escolheu a opcao 1!");
        break;
    case 2 : printf("Usuario escolheu a opcao 2!");
        break;
    case 3 : printf("Usuario escolheu a opcao 3!");
        break;
    
    default: printf("Alternativa invalida!");
        break;
    }
}