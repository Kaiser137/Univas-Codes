public class Palindromo {
    public boolean isPalindromo(String palavra){
    PilhaDinamica pilha = new PilhaDinamica();
    FilaDinamica fila = new FilaDinamica();

        if (palavra == null){
            return false;
        }

        palavra = palavra.toLowerCase();
        
        char[] vetorPalindromo = palavra.toCharArray();
        char[] vetorPilha = new char[vetorPalindromo.length];
        char[] vetorFila = new char[vetorPalindromo.length];
        int contador = 0;
         
        for(int i = 0; i < vetorPalindromo.length; i++){
            pilha.push(vetorPalindromo[i]);
            fila.enfileirar(vetorPalindromo[i]);
        }

        for(int i = 0; i < vetorPalindromo.length; i++){
            vetorPilha[i] = (char) pilha.pop();
            vetorFila[i] = (char) fila.desenfileirar();
        }

        for(int i = 0; i < vetorPalindromo.length; i++){
            if(vetorPilha[i] == vetorFila[i]){
                contador ++;
            }
        }

        if(contador == vetorPalindromo.length){
            return true;
        } else {
            return false;
        }
    }
}
