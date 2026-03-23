public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("🔥 --- INICIANDO O JOGO DA BATATA QUENTE --- 🔥\n");

        // 1. Criamos a nossa roda (Fila)
        FilaDinamica roda = new FilaDinamica();

        // 2. Colocamos 5 jogadores na roda (IDs de 1 a 5)
        System.out.println("Jogadores entrando na roda...");
        roda.enfileirar(1);
        roda.enfileirar(2);
        roda.enfileirar(3);
        roda.enfileirar(4);
        roda.enfileirar(5);

        // Mostramos como a roda começou
        roda.imprimir();

        // 3. Definimos as regras do jogo
        int passes = 3; // A batata pula 3 vezes antes de explodir
        System.out.println("\nRegra: A batata vai passar " + passes + " vezes por rodada!\n");
        System.out.println("🎶 Batata quente, quente, quente... 💥");

        // 4. O Grande Momento: Rodamos o jogo!
        // Passamos a própria roda e o número de passes. O método vai nos devolver o vencedor.
        int vencedor = roda.batataQuente(roda, passes);

        // 5. Coroamos o campeão!
        System.out.println("\n🏆 O JOGO ACABOU! O GRANDE VENCEDOR FOI O JOGADOR: " + vencedor + " 🏆");
        
        System.out.println("\n🔥 --- FIM DA BRINCADEIRA --- 🔥");
    }
}