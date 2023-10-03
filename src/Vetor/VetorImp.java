package Vetor;

public class VetorImp implements Vetor {
    @Override
    public double soma(int[] ar) {
        double soma = 0;
        for (double numero : ar) {
            soma += numero;
        }

        return soma;
    }

    @Override
    public double media(int[] ar) {

        double media = soma(ar) / ar.length;

        return media;
    }
}
