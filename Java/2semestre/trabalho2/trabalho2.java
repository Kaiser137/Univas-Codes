package Segundo_Semestre.trabalho2;

import java.util.Scanner;

public class trabalho2 {

    public static String[] preencheString(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantos nomes você deseja inserir na string?");
            int num = scanner.nextInt();

            String vetorNomes[] = new String[num];
            for(int i = 0; i < num; i++){
                
            }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int vetorE[colhas] = preencheString();

        System.out.println("Após ter preenchido o vetor, escolha entre as opões abaixo: ");
        int fim = 0;
        while(fim == 0){
            System.out.println("1 - Exibir todos os nomes \n0 - Sair");
            int escolha = scanner.nextInt();
            if (escolha == 1){
                exibirNumero(vetorE)colhas;
            } else if (escolha == 2) {
                
            }  else if (escolha == 3) {
                
            } else if (escolha == 4) {

            } else if (escolha == 5) {

            } else if (escolha == 0) {
                fim = fim + 1;
            } else {
                System.out.println("Opção inválida! Escolha novamente!");
            }
        }
    }  
    

}

