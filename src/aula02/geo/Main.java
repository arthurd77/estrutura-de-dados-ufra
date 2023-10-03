package aula02.geo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        double areaCirculo = circulo.calcularArea();
        System.out.printf("ÁREA DO CIRCULO: %.1f\n", areaCirculo);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
        double areaQuadrado = quadrado.calcularArea();
        System.out.printf("ÁREA DO QUADRADO: %.0f", areaQuadrado);
    }
}
