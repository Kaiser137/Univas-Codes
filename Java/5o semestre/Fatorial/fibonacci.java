public class fibonacci {

    public static int fibo(int t) {
        if (t == 0) {
            return 0;
        } else if(t == 1){
            return 1;
        }
        else {
            return fibo(t-1) + fibo(t-2);
        }
    }

    public static void main(String[] args) {
        int termino = 8;
        int resultado = fibo(termino);
        System.out.println(resultado);
    }
}