package aula01;

public class Calc2023 implements Calculadora {
    @Override
public double soma(double a, double b) {
    System.out.println("CALC 2023");
    return a + b;
}

    @Override
    public double subtracao(double a, double b) {
        System.out.println("CALC 2023");
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) {
        System.out.println("CALC 2023");
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
        System.out.println("CALC 2023");
        return a / b;
    }
}