package aula02.ExemploO_N2;

public class BubbleSort {
    public static void bubbleSort(int[] array, int tipoOrdenacao) {
        int n = array.length;
        if (tipoOrdenacao == 1) { // se tipoOrdenacao == 1: ordem decrescente
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else if (tipoOrdenacao == 2) { // se tipoOrdenacao == 2: ordem crescente
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array antes da ordenação:");
        imprimirArray(numeros);

        bubbleSort(numeros, 2); // tipoOrdenacao 1 = ordem decrescente, tipoOrdenacao 2 = ordem crescente;

        System.out.println("Array após a ordenação:");
        imprimirArray(numeros);

    }
}
