package Segundo_Semestre.trabalho2;

import java.util.Scanner;

public class trabalho2 {

    //-----------------------------------------------------------------------------------------------
    public static String[] preencheString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos nomes você deseja inserir na string?");
        String passarPraInt = scanner.nextLine();

        int num = Integer.parseInt(passarPraInt);

        String vetorNomes[] = new String[num];
        for(int i = 0; i < num; i++){
            int somando = i + 1;
            System.out.println("Digite o " + somando + "° nome: ");
            vetorNomes[i] = scanner.nextLine();
        }

        return vetorNomes;
    }
    //-----------------------------------------------------------------------------------------------
// 1
    public static void exibirNomes(String[] vetorNomes){
        for(int i = 0; i < vetorNomes.length; i++){
            int somando = i + 1;
            System.out.println("O " + somando + "° nome do vetor é: " + vetorNomes[i]);
        }
    }
    //-----------------------------------------------------------------------------------------------
// 2
    public static String buscarNomePorIndice(String[] nomes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < nomes.length) {
            return nomes[indice];
        } else {
            return "Índice inválido";
        }
    }

//-----------------------------------------------------------------------------------------------
// 3
        public static String[] converterParaMaiusculas(String[] nomes) {
            String[] nomesMaiusculos = new String[nomes.length];

            for (int i = 0; i < nomes.length; i++) {
                nomesMaiusculos[i] = nomes[i].toUpperCase();
            }

            return nomesMaiusculos;
        }
//-----------------------------------------------------------------------------------------------
// 4
        public static String contarMaiorNome(String[] vetor, int index){
            if (index == vetor.length - 1) {
                return vetor[index];
            }
            String maiorNomeRestante = contarMaiorNome(vetor, index + 1);
            return vetor[index].length() > maiorNomeRestante.length() ? vetor[index] : maiorNomeRestante;
        }

//-----------------------------------------------------------------------------------------------
// 5
        public static int contadorNomes(String[] vetor , int index, char letra){
            if(index == vetor.length){
                return 0;
            }
            int contador = (vetor[index].charAt(0) == letra) ? 1:0;

            return contador + contadorNomes(vetor, index + 1, letra);
        }

//-----------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] vetor = preencheString();

    System.out.println("Após ter preenchido o vetor, escolha entre as opções abaixo: ");
    int fim = 0;
    while (fim == 0) {
        System.out.println("1 - Exibir todos os nomes \n2 - Buscar um nome pelo índice \n3 - Converter todos os nomes para maiúsculas \n4 - Mostrar o maior nome \n5 - Contar quantos nomes começam com uma letra específica\n0 - Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (escolha == 1) {
            exibirNomes(vetor);
        } else if (escolha == 2) {
            String indiceVetor = buscarNomePorIndice(vetor);
            System.out.println("Nome encontrado: " + indiceVetor);
        } else if (escolha == 3) {
            String[] vetorMaiusculo = converterParaMaiusculas(vetor);
            for (int i = 0; i < vetorMaiusculo.length; i++) {
                System.out.println("Nome convertido: " + vetorMaiusculo[i]);
            }
        } else if (escolha == 4) {
            String maiorNome = contarMaiorNome(vetor, 0);
            System.out.println("O maior nome é: " + maiorNome);
        } else if (escolha == 5) {
            System.out.println("Digite a letra inicial desejada:");
            char letra = scanner.nextLine().charAt(0);
            int quantidade = contadorNomes(vetor, 0, letra);
            System.out.println("Quantidade de nomes que começam com '" + letra + "': " + quantidade);
        } else if (escolha == 0) {
            fim = 1;
        } else {
            System.out.println("Opção inválida! Escolha novamente!");
        }
    }
    scanner.close();
}

}

