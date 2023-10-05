package aula02.exemplo;

public class ExemploOn {
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = calcularSoma(numeros);
        System.out.println("A app dos elementos é: " + resultado);
    }
}
