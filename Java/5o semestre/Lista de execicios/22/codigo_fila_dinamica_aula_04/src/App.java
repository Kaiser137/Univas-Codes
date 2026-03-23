public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- INICIANDO TESTE DE PALÍNDROMOS ---");

        // 1. Criamos o nosso objeto verificador a partir da sua classe
        Palindromo verificador = new Palindromo();

        // 2. Criamos uma listinha de palavras para testar
        String palavra1 = "osso";
        String palavra2 = "radar";
        String palavra3 = "bola";
        String palavra4 = "java";

        // 3. Fazemos os testes e imprimimos o resultado na tela
        System.out.println("A palavra '" + palavra1 + "' é palíndromo? " + verificador.isPalindromo(palavra1));
        System.out.println("A palavra '" + palavra2 + "' é palíndromo? " + verificador.isPalindromo(palavra2));
        System.out.println("A palavra '" + palavra3 + "' é palíndromo? " + verificador.isPalindromo(palavra3));
        System.out.println("A palavra '" + palavra4 + "' é palíndromo? " + verificador.isPalindromo(palavra4));

        System.out.println("--- FIM DOS TESTES ---");
    }
}