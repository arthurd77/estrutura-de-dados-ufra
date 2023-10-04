package aula03.Fatorial;

import aula03.Fatorial.CalculaFatorial;

public class Main {
    public static void main(String[] args) throws Exception{
        long numero = 15;
        long resultado = CalculaFatorial.calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
