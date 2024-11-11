#include <stdio.h>

float ObterMedia(int idades[], int contador){
    int soma = 0;
    float media = 0.0;
    for(int i = 0; i < contador; i++){
        soma = soma + idades[i];
    }
    media = soma / (float)contador;
    return media;
}

float obtemDesvioPadrao(int idades_funcao[], int quantidade_total, float media_funcao){
    float somatorio_de_desvios = 0.0;
    float desvio_padrao = 0.0;

    for(int i = 0; i < quantidade_total; i++){
        float valor = 0.0;

        valor = media_funcao - idades_funcao[i];

        if(valor < 0){
            valor = valor * -1;
        }

        somatorio_de_desvios = somatorio_de_desvios + valor;
    }

    desvio_padrao = somatorio_de_desvios / quantidade_total;
    return desvio_padrao;
}

int main()
{
     int idades[20];
    int idade_lida = 0;
    int contador_de_idades = 0;

    for(int i = 0; i < 20; i++){
        printf("Digite uma idade:\n");
        scanf("%d", &idade_lida);

        if(idade_lida < 0){
            break;
        }else{
            idades[i] = idade_lida;
            contador_de_idades++;
        }
    } 

    float media = ObterMedia(idades, contador_de_idades);
    float desvio = obtemDesvioPadrao(idades, contador_de_idades, media);
    printf("O desvio padrao eh: %.2f", desvio);
}