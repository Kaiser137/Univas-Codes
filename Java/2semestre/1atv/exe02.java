package Segundo_Semestre;

import java.util.Random;

public class exe02 {

    public static void main(String[] args){
        Random random = new Random();
        int[] par = new int[10];
        int[] impar = new int[10];

        int p = 0;
        int im = 0;

        while(p < 10 || im < 10){
            int indice = random.nextInt(19) + 1;
            if (indice % 2 == 0 && p < 10){
                par[p] = indice;
                p++;
            }
            else if(indice % 2 != 0 && im < 10){
                impar[im] = indice;
                im++;
            }
        }

        for(int i = 0; i < 10; i++){
            if(par[i] > 0){
                System.out.println("O numero par na posicao "+ i +" eh: "+ par[i]);
            }
        }

        for(int i = 0; i < 10; i++){
            if(impar[i] > 0){
                System.out.println("O numero impar na posicao "+ i +" eh: "+ impar[i]);
            }
        }

    }

}