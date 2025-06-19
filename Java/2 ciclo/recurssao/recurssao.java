import java.util.Scanner;

public class recurssao{
    public static int fazPotencia(int n, int potencia) {
        if (n == 0 || n == 1 || potencia == 0) {
            return 1;
        } else {
            return n * fazPotencia(n, potencia - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        System.out.println("Digite a potência: ");
        int potencia = scanner.nextInt();
        
        int resultado = fazPotencia(n, potencia);
        System.out.println(resultado);
        
        scanner.close();
    }
}