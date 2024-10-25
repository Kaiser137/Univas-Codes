#include <stdio.h>
#include <math.h>

int main(){
    int quant, idade_lida, encerrado = 0;

    printf("Quantas idades voce quer ler? (maximo 20 idades)");
    scanf("%d", &quant);

    int idade[quant], desviopadrao[quant];

    if(quant > 20){
        printf("\nEncerrado!");
    }
    else{
        for(int i = 0; i < quant; i++){
            printf("\nDigite uma idade: ");
            scanf("%d", &idade_lida);
            if(idade_lida < 0){
                printf("\nEncerrado!");
                i = quant;
                encerrado = 1;
            } else{
            idade[i] = idade_lida;
            }
        }
        
        // Media
        if (encerrado == 1){
            printf("");
        }
        else{
        int soma = 0;
        for(int i = 0; i < quant; i++){
            soma = soma + idade[i];
        }
        int media;
        media = soma / quant;
        printf("\nA media eh: %d", media);
        }
        
        // Maior idade
        int maior = 0;
        if (encerrado == 1){
            printf("");
        }
        else{
        int atual;
        for(int i = 0; i < quant; i++){
            atual = idade[i];
            if(atual > maior){
                maior = atual;
            }
        }
        printf("\nA maior idade eh: %d", maior);
        }
        // Menor idade
        int menor = 10000000;
        if (encerrado == 1){
            printf("");
        }
        else{
        int atual = 0;
        for(int i = 0; i < quant; i++){
            atual = idade[i];
            if(atual < menor){
                menor = atual;
            }
        }
        printf("\nA menor idade eh: %d", menor);
        }
        
        // Desvio padrão
        if (encerrado == 1){
            printf("");
        }
        else{
        int soma = 0;
        for(int i = 0; i < quant; i++){
            soma = soma + idade[i];
        }
        int media, desvio = 0, total = 0, somadesvio = 0;
        media = soma / quant;
        for(int i = 0; i < quant; i++){
            desviopadrao[i] = media - idade[i];
        }
        for(int i = 0; i < quant; i++){
            desviopadrao[i] = pow(desviopadrao[i], 2);
        }
        for(int i = 0; i < quant; i++){
            somadesvio = somadesvio + desviopadrao[i];
        }
        desvio = somadesvio / quant;
        total = sqrt(desvio);
        printf("\nA desvio eh: %d", total);
        }
        
        // Diferença entre mais novo e mais velho
        if (encerrado == 1){
            printf("");
        }
        else{
        int total = 0;
        total = maior - menor;
        printf("\nA diferenca entre maior e menor eh: %d anos!", total);
        }
    }
}