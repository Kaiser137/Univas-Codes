public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTANDO A PILHA DINÂMICA (LIFO) ===\n");
        
        PilhaDinamica pilha = new PilhaDinamica();

        System.out.println("1. Empilhando (Push) os valores 10, 20 e 30...");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30); // 30 foi o último a entrar, logo é o topo
        
        pilha.imprimir();

        System.out.println("\n2. Espiando o topo (Peek): " + pilha.peek());
        System.out.println("O valor 30 continua lá? Vamos conferir:");
        pilha.imprimir();

        System.out.println("\n3. Desempilhando (Pop)...");
        int removido1 = pilha.pop();
        System.out.println("Valor removido: " + removido1);
        
        System.out.println("Como ficou a pilha agora?");
        pilha.imprimir();

        System.out.println("\n4. Desempilhando o resto...");
        System.out.println("Removido: " + pilha.pop()); // Tira o 20
        System.out.println("Removido: " + pilha.pop()); // Tira o 10
        
        pilha.imprimir();
        
        // Descomente a linha abaixo na aula para mostrar a exceção de Pilha Vazia aos alunos:
        // pilha.pop();
    }
}
