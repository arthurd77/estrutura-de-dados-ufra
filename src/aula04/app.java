package aula04;

public class app {
    public static int soma(int[] arr) {
        int soma = 0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma;
    }

    public static double media(int[] arr) {
        return (double) soma(arr) / arr.length;
    }

    public static int maior(int[] arr) {
        int maior = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        return maior;
    }

    public static int menor(int[] arr) {
        int menor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        return menor;
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

    public static void troca(int[] arr, int ind1, int ind2) {
        int indice1 = arr[ind1];

        arr[ind1] = arr[ind2];
        arr[ind2] = indice1;
    }

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("A soma dos numeros é: " + soma(numeros));
        System.out.println("A média dos numeros é: " + media(numeros));
        System.out.println("O maior numero é: " + maior(numeros));
        System.out.println("O menor numero é: " + menor(numeros) + "\n");
        print(numeros);
        troca(numeros, 0, 2);


    }
}