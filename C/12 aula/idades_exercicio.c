#include <stdio.h>

void mostrarDados(int vetor_de_idades[], int quantidade_total){
    for(int i = 0; i < quantidade_total; i++){
        printf("Idade lida: %d\n", vetor_de_idades[i]);
    }
}

float ObterMedia(int idades[], int contador){
    int soma = 0;
    float media = 0.0;
    for(int i = 0; i < contador; i++){
        soma = soma + idades[i];
    }
    media = soma / (float)contador;
    return media;
}

int obtemMaiorValor(int vetor_de_idades[], int quantidade_total){
    int maior = 0;

    for(int i = 0; i < quantidade_total; i++){
        if(vetor_de_idades[i] > maior){
            maior = vetor_de_idades[i];
        }
    }

    return maior;
}

int obtemMenorValor(int idades_funcao[], int quantidade_total){
    int menor = idades_funcao[0];

    for(int i = 0; i < quantidade_total; i++){
        if(idades_funcao[i] < menor){
            menor = idades_funcao[i];
        }
    }

    return menor;
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

int main(){
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

    mostrarDados(idades, contador_de_idades);

    float media = ObterMedia(idades, contador_de_idades);
    printf("Media das idades: %.2f\n", media);

    int maior = obtemMaiorValor(idades, contador_de_idades);
    printf("A maior idade eh: %d\n", maior);

    int menor = obtemMenorValor(idades, contador_de_idades);
    printf("A menor idade eh: %d\n", menor);

    // Diferença entre o mais velho e mais novo
    printf("A diferenca de idade entre o mais velho e o mais novo eh de: %d anos\n", maior - menor);

    // Diferença entre o mais velho e mais novo
    float desvio = obtemDesvioPadrao(idades, contador_de_idades, media);
    printf("O desvio padrao eh: %.2f", desvio);

}