package aula03.Fatorial;

import aula03.Fatorial.CalculaFatorial;

public class FatorialSemRecursao {
    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        long numero = 5; // O número para o qual queremos calcular o fatorial
        long resultado = CalculaFatorial.calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);

        int res2 = calcularFatorial(5
        );
        System.out.println("O fatorial de " + 5 + " é " + res2);
    }
}