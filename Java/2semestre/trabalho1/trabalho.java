package Segundo_Semestre.Trabalho1;

import java.util.Scanner;

public class trabalho {
    public static int[] preencheVetor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que quer utilizar: ");
        int numVetor = scanner.nextInt();

        while (numVetor <= 0){
            System.out.println("Número inválido! Digite a quantidade de numeros que quer utilizar (maior que 0): ");
            numVetor = scanner.nextInt();
        }

        int vetor[] = new int[numVetor];

        for(int i = 0; i < numVetor; i++){
            int somando = i + 1;
            System.out.println("Digite o numero " + somando + " do vetor: ");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }
    public static int somarNumeros(int vetor[], int index) {
        if (index >= vetor.length) {
            return 0;
        }
        return vetor[index] + somarNumeros(vetor, index + 1);
    }
    public static int acharPares(int vetor[], int index) {
        if (index >= vetor.length) {
            return 0;
        }
        if (vetor[index] % 2 == 0) {
            return 1 + acharPares(vetor, index + 1);
        } else {
            return acharPares(vetor, index + 1);
        }
    }
    //----------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------Área de Exibição-------------------------------------------------------------

    public static void exibirNumero(int vetor[]){
        System.out.println("Exibindo todos os numeros do vetor: ");
        for(int i = 0; i < vetor.length; i++){
            int somando = i + 1;
            System.out.println("O numero da posição " + somando + " é: " + vetor[i]);
        }
        System.out.println("------------------------------------------------------------");
    }
    public static void exibirSoma(int vetor[]){
         System.out.println("A soma dos numeros do vetor é: ");
        int soma = somarNumeros(vetor, 0);
        System.out.println(soma);
        System.out.println("------------------------------------------------------------");
}
    public static void exibirPares(int vetor[]){
       System.out.println("Os numeros pares do vetor são: ");
        int qtdPares = acharPares(vetor, 0);
        System.out.println(qtdPares);
        System.out.println("------------------------------------------------------------");
        }
    //----------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int vetorPrincipal[] = preencheVetor();

        System.out.println("Após ter preenchido o vetor, escolha entre as opões abaixo: ");
        int fim = 0;
        while(fim == 0){
            System.out.println("1 - Exibir todos os números; \n2 - Calcular a soma dos números; \n3 - Contar quantos números são pares; \n4 - Exibir os números na ordem inversa; \n5 - Buscar um número; \n0 - Sair");
            int escolha = scanner.nextInt();
            if (escolha == 1){
                exibirNumero(vetorPrincipal);
            } else if (escolha == 2) {
                exibirSoma(vetorPrincipal);
            }  else if (escolha == 3) {
                exibirPares(vetorPrincipal);
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
