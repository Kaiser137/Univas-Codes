package Univas.TerceiroSemestre.Aula01;

import java.util.Scanner;

public class Exe04 {
    //Calculadora 4 operacoes básicas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a operação desejada: ");
        System.out.println("1 para soma, 2 para subtração");
        System.out.print("3 para multiplicacao, 4 divisao: ");
        int operacao = scanner.nextInt();

        if (operacao == 1){
            double total = n1 + n2;
            System.out.print("O resultado eh: " + total);
        } else if(operacao == 2){
            double total = n1 - n2;
            System.out.print("O resultado eh: " + total);
        } else if(operacao == 3){
            double total = n1 * n2;
            System.out.print("O resultado eh: " + total);
        } else if(operacao == 4){
            double total = n1 / n2;
            System.out.print("O resultado eh: " + total);
        }

    }
}
