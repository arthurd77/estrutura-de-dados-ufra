package aula01;

public class CalcImplements implements Calculadora {

    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) {
        return a - b;
    }

    @Override
    public double divisao(double a, double b) {
        return a / b;
    }

    @Override
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public void ola(){
        System.out.println("ola calabreso, toma a tua conta ai \n");
    }
}
