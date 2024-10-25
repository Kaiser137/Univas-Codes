#include <stdio.h>

int main(){
    int idades[20], idade_lida, requisicao;

//requisicao
//----------------------------------------------------------------------------------------
        printf("Digite a quantidade de idades a serem requisitadas: ");
        scanf("%d", &requisicao);


//condicional
//-----------------------------------------------------------------------------------------
if(requisicao<=20){
    for(int i = 0; i < requisicao; i++){
        printf("Digite sua idade: ");
        scanf("%d", &idade_lida);

        idades[i] = idade_lida;
    }
      for(int i = 0; i < requisicao; i++){
        printf("\tIdades sao %d: %d ", i, idades[i]);
    }
//------------------------------------------------------------------------------------------
//média
     int soma = 0;
        for (int i = 0; i < requisicao; i++) {
            soma += idades[i];
        }
        int media = soma / requisicao;

        printf("\nA media das idades e: %d\n", media);
//-------------------------------------------------------------------------------------------    
//maior idade
        int maior = idades[0];
        for (int i = 1; i < requisicao; i++){
            if(idades[i] > maior){
                maior = idades[i];
            }
        }
        printf("A maior idade e : %d\n",maior);
     
//--------------------------------------------------------------------------------------------  
//menor idade
        int menor = idades[0];
        for (int i = 1; i < requisicao; i++){
            if(idades[i] < menor){
                menor = idades[i];
            }
        }
        printf("A menor idade e : %d\n",menor);
//--------------------------------------------------------------------------------------------
    } else {
        printf("Encerrado!");
    }
}