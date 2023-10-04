import aula01.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalcImplements();
        double soma = calculadora.soma(2, 2);
        double subtracao = calculadora.subtracao(4, 2);
        double divisao = calculadora.divisao(4, 2);
        double multiplacacao = calculadora.multiplicacao(2, 2);


        ((CalcImplements)calculadora).ola();

        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multiplacacao);
        System.out.println("DIVISÃO: " + divisao);

        /* ou:
        /*System.out.format("SOMA: %s\n", soma);/*
        System.out.format("MULTIPLICACAO: %s", multiplacacao);*/
    }
}
