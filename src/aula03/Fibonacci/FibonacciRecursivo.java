package aula03.Fibonacci;

public class FibonacciRecursivo {
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int termo = 10; // O termo da seq de Fibonacci
        int resultado = calcularFibonacci(termo);
        System.out.println("O " + termo + " termo da sequência de Fibonacci " + resultado);
    }
}
