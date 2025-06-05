package Segundo_Semestre.atv2;

import java.util.Random;

public class exe01 {
    public static String[] armazenarMeses(){
        String[] array_meses = new String[12];

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

        return array_meses;
    }

    public static int NumRandom(){
        Random random = new Random();

        int ind = random.nextInt(12);

        return ind;
    }

    public static void Todos(String[] array_meses){
        Random random = new Random();
        for(int i = 0; i < 12; i++){
            int indice = random.nextInt(12);
            System.out.println(array_meses[indice]);
        }
    }


    public static void main(String[] args) {
        String[] array_meses = new String[12];

        array_meses = armazenarMeses();

        int ind = NumRandom();
        System.out.println(array_meses[ind] + " // esse é um mês sozinho!");

        System.out.println("Abaixo são os meses aleatóriamente!");

        Todos(array_meses);
    }
}