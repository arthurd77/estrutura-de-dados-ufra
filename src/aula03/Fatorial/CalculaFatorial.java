package aula03.Fatorial;

public class CalculaFatorial {
    public static long calcularFatorial(long n) {
        // Caso base: Quando n é 0 ou 1, o fatorial é 1.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva: n! = n * (n-1)!
            return n * calcularFatorial(n - 1);
        }
    }
}


