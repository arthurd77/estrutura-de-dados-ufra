package aula05;

public class App {
    public static void main(String[] args) {
        int[][] vendas = {
                {50, 60, 78, 87, 95},
                {98, 87, 75, 76, 99},
                {98, 99, 97, 95, 100},
        };
        System.out.println("vendas [0] [0]: " + vendas[0][0]);
        System.out.println("vendas [2] [1]: " + vendas[2][1]);
        System.out.println("num de linhas: " + vendas.length);
        System.out.println("num de colunas: " + vendas[0].length + "\n");

        matriz(vendas);
        System.out.println("A soma é: " + soma((vendas)));
        System.out.println("A média é: " + media(vendas));

        somarLinhas(vendas);
    }

    public static void matriz(int[][] vendas) {
        System.out.println("[");
        for (int i = 0; i < vendas.length; i++) {
            System.out.print("[");
            for (int j = 0; j < vendas[i].length; j++) {
                if (j == vendas[i].length - 1) {
                    System.out.printf("%s", vendas[i][j]);

                } else {
                    System.out.printf("%s, ", vendas[i][j]);
                }
                if (j == vendas[i].length - 1) {
                    System.out.println("]");

                }
            }
        }
        System.out.println("]\n");
    }

    public static int soma(int[][] arr) {
        int soma = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                soma += arr[i][j];
            }
        }
        return soma;
    }

    public static double media(int[][] arr) {
        int tamanho = arr.length * arr[0].length;
        return soma(arr) / tamanho;
    }

    public static void somarLinhas(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < mat[i].length; j++) {
                somaLinha += mat[i][j];
            }
            System.out.println("Soma Linha " + (i + 1) + " é: " + somaLinha);
        }
    }
}
