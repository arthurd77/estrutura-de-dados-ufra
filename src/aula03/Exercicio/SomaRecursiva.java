package aula03.Exercicio;

public class SomaRecursiva {
    public static int somaArrayRecursivamente(int[] array, int tamanho) {
        if (tamanho == 0) {
            return 0;
        } else {
            return array[tamanho - 1] + somaArrayRecursivamente(array, tamanho - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        int tamanho = array.length;
        int resultado = somaArrayRecursivamente(array, tamanho);
        System.out.println("A app recursiva é: " + resultado);
    }
}
