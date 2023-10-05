package aula02.ExemploO_N2;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort2 {
    public static void troca(int[] arr, int ind1, int ind2) {
        int indice1 = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = indice1;
    }

    public static void bubbleSort(int[] array, int tipoOrdenacao) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tipoOrdenacao == 1) {
                    if (array[j] > array[j + 1]) {
                        troca(array, j, j + 1);
                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        troca(array, j, j + 1);
                    }
                }
            }
        }
    }


    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");

            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(numeros, 1);
        print(numeros);
    }
}