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
        System.out.println("num de colunas: " + vendas[0].length);

        matriz(vendas);

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
                    if (j == vendas[i].length - 1) {
                        System.out.println("]");
                    }
                }
            }
        }
        System.out.println("]");
    }

}


