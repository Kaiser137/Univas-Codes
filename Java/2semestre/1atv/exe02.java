package Segundo_Semestre;

import java.util.Random;

public class exe01 {

    public static void main(String[] args){
        String[] array_meses = new String[12];
        Random random = new Random();

        array_meses[0] = "Janeiro";
        array_meses[1] = "Fevereiro";
        array_meses[2] = "Março";
        array_meses[3] = "Abril";
        array_meses[4] = "Maio";
        array_meses[5] = "Junho";
        array_meses[6] = "Julho";
        array_meses[7] = "Agosto";
        array_meses[8] = "Setembro";
        array_meses[9] = "Outubro";
        array_meses[10] = "Novembro";
        array_meses[11] = "Dezembro";

        int ind = random.nextInt(12);
        System.out.println(array_meses[ind] + " // esse é um mês sozinho!");

        System.out.println("Abaixo são os meses aleatóriamente!");


        for(int i = 0; i < 12; i++){
            int indice = random.nextInt(12);
            System.out.println(array_meses[indice]);
        }
    }

}