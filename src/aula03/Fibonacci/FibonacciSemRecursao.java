package aula03.Fibonacci;

import aula03.Fibonacci.FibonacciRecursivo;

public class FibonacciSemRecursao {
    public static int calcularFibonacci(int n) {
        int[] fibonacci = new int[n + 1];
        if (n == 0) {
            return fibonacci[fibonacci.length - 1];
            // ou
            // return 0;
        } else {
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            return fibonacci[n];
        }
    }

    public static void main(String[] args) {
//        int termo = 10;
//        int resultado = calcularFibonacci(termo);
//        System.out.println("O " + termo + " da seq de Fibonacci é " + resultado);
        int n = 10;

        for (int i = 0; i <= n; i++) {
            System.out.println(calcularFibonacci(i));
        }
    }
}