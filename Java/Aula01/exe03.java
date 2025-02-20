package Univas.TerceiroSemestre.Aula01;

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite a primeira nota: ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite a primeira nota: ");
        float n3 = scanner.nextFloat();

        float total = (n1 + n2 + n3) / 3;

        if(total >= 7){
            System.out.print("Aprovado!");
        }
        else if(total < 6){
            System.out.print("Reprovado!");
        }
        else{
            System.out.println("Digite a nota do exame: ");
            float notaExame = scanner.nextFloat();
            float totalExame = (n1 + n2 + n3 + notaExame) / 4;
            if(totalExame >= 6){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }

    }

}
