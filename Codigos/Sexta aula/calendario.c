#include <stdio.h>

int main(){
    int ncal, ano, bisexto;

    printf("Digite um mês de acordo com seu numero: (exemplo: janeiro = 1)\n");
    scanf("%d", &ncal);
    printf("Digite o ano atual: \n");
    scanf("%d", &ano);

    printf("Usando IF ELSE\n");
    if (ano % 4 == 0){
        if (ncal == 1){
            printf("Janeiro tem 31 dias!");
        }
        else if (ncal == 2){
            printf("Fevereiro tem 29 dias!");
        }
        else if (ncal == 3){
            printf("Março tem 31 dias!");
        }
        else if (ncal == 4){
            printf("Abril tem 30 dias!");
        }
        else if (ncal == 5){
            printf("Maio tem 31 dias!");
        }
        else if (ncal == 6){
            printf("Junho tem 30 dias!");
        }
        else if (ncal == 7){
            printf("Julho tem 31 dias!");
        }
        else if (ncal == 8){
            printf("Agosto tem 31 dias!");
        }
        else if (ncal == 9){
            printf("Setembro tem 30 dias!");
        }
        else if (ncal == 10){
            printf("Outubro tem 31 dias!");
        }
        else if (ncal == 11){
            printf("Novembro tem 30 dias!");
        }
        else if (ncal == 12){
            printf("Dezembro tem 31 dias!");
        }
        else {
            printf("Mes inexistente!");
        }
    }
    else{
        if (ncal == 1){
            printf("Janeiro tem 31 dias!");
        }
        else if (ncal == 2){
            printf("Fevereiro tem 28 dias!");
        }
        else if (ncal == 3){
            printf("Março tem 31 dias!");
        }
        else if (ncal == 4){
            printf("Abril tem 30 dias!");
        }
        else if (ncal == 5){
            printf("Maio tem 31 dias!");
        }
        else if (ncal == 6){
            printf("Junho tem 30 dias!");
        }
        else if (ncal == 7){
            printf("Julho tem 31 dias!");
        }
        else if (ncal == 8){
            printf("Agosto tem 31 dias!");
        }
        else if (ncal == 9){
            printf("Setembro tem 30 dias!");
        }
        else if (ncal == 10){
            printf("Outubro tem 31 dias!");
        }
        else if (ncal == 11){
            printf("Novembro tem 30 dias!");
        }
        else if (ncal == 12){
            printf("Dezembro tem 31 dias!");
        }
        else {
            printf("Mes inexistente!");
        }
    }

    bisexto = ano % 4;

    printf("\nUsando Switch com break\n");
    switch (bisexto)
    {
    case 0 : switch (ncal)
    {
    case 1 : printf("Janeiro tem 31 dias!");
    break;
    case 2 : printf("Fevereiro tem 29 dias!");
    break;
    case 3 : printf("Março tem 31 dias!");
    break;
    case 4 : printf("Abril tem 30 dias!");
    break;
    case 5 : printf("Maio tem 31 dias!");
    break;
    case 6 : printf("Junho tem 30 dias!");
    break;
    case 7 : printf("Julho tem 31 dias!");
    break;
    case 8 : printf("Agosto tem 31 dias!");
    break;
    case 9 : printf("Setembro tem 30 dias!");
    break;
    case 10 : printf("Outubro tem 31 dias!");
    break;
    case 11 :  printf("Novembro tem 30 dias!");
    break;
    case 12 : printf("Dezembro tem 31 dias!");
    break;

    default: printf("Mes inexistente!");
        break;
    } 
        break;
    
    default : switch (ncal)
    {
    case 1 : printf("Janeiro tem 31 dias!");
    break;
    case 2 : printf("Fevereiro tem 28 dias!");
    break;
    case 3 : printf("Março tem 31 dias!");
    break;
    case 4 : printf("Abril tem 30 dias!");
    break;
    case 5 : printf("Maio tem 31 dias!");
    break;
    case 6 : printf("Junho tem 30 dias!");
    break;
    case 7 : printf("Julho tem 31 dias!");
    break;
    case 8 : printf("Agosto tem 31 dias!");
    break;
    case 9 : printf("Setembro tem 30 dias!");
    break;
    case 10 : printf("Outubro tem 31 dias!");
    break;
    case 11 :  printf("Novembro tem 30 dias!");
    break;
    case 12 : printf("Dezembro tem 31 dias!");
    break;

    default: printf("Mes inexistente!");
        break;
    } 
        break;
    }

    printf("\nUsando Switch sem break\n");

    int total = 0;

    switch (bisexto)
    {
    case 0 : switch (ncal)
    {
    
    case 12 : total = total + 1;
    case 11 : total = total + 1;
    case 10 : total = total + 1;
    case 9 : total = total + 1;
    case 8 : total = total + 1;
    case 7 : total = total + 1;
    case 6 : total = total + 1;
    case 5 : total = total + 1;
    case 4 : total = total + 1;
    case 3 : total = total + 1;
    case 2 : total = total + 1;
    case 1 : total = total + 1;

    switch (total)
        {
    case 1 : printf("Janeiro tem 31 dias!");
    break;
    case 2 : printf("Fevereiro tem 29 dias!");
    break;
    case 3 : printf("Março tem 31 dias!");
    break;
    case 4 : printf("Abril tem 30 dias!");
    break;
    case 5 : printf("Maio tem 31 dias!");
    break;
    case 6 : printf("Junho tem 30 dias!");
    break;
    case 7 : printf("Julho tem 31 dias!");
    break;
    case 8 : printf("Agosto tem 31 dias!");
    break;
    case 9 : printf("Setembro tem 30 dias!");
    break;
    case 10 : printf("Outubro tem 31 dias!");
    break;
    case 11 :  printf("Novembro tem 30 dias!");
    break;
    case 12 : printf("Dezembro tem 31 dias!");
    break;

    default: printf("Mes inexistente!");
        break;
        }
        break;
    } 
    break;
    
    default : switch (ncal)
    {
    case 12 : total = total + 1;
    case 11 : total = total + 1;
    case 10 : total = total + 1;
    case 9 : total = total + 1;
    case 8 : total = total + 1;
    case 7 : total = total + 1;
    case 6 : total = total + 1;
    case 5 : total = total + 1;
    case 4 : total = total + 1;
    case 3 : total = total + 1;
    case 2 : total = total + 1;
    case 1 : total = total + 1;

    switch (total)
        {
        case 1 : printf("Janeiro tem 31 dias!");
    break;
    case 2 : printf("Fevereiro tem 28 dias!");
    break;
    case 3 : printf("Março tem 31 dias!");
    break;
    case 4 : printf("Abril tem 30 dias!");
    break;
    case 5 : printf("Maio tem 31 dias!");
    break;
    case 6 : printf("Junho tem 30 dias!");
    break;
    case 7 : printf("Julho tem 31 dias!");
    break;
    case 8 : printf("Agosto tem 31 dias!");
    break;
    case 9 : printf("Setembro tem 30 dias!");
    break;
    case 10 : printf("Outubro tem 31 dias!");
    break;
    case 11 :  printf("Novembro tem 30 dias!");
    break;
    case 12 : printf("Dezembro tem 31 dias!");
    break;

    default: printf("Mes inexistente!");
        break;
        }
        break;
    } 
        break;
    }
    
}