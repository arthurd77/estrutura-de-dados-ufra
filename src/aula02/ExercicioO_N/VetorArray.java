package aula02.ExercicioO_N;

public class VetorArray implements Vetor {
    @Override
    public double media(double[] aux) {
        double soma = 0;

        for (int i = 0; i < aux.length; i++) {
            soma += aux[i];
        }
        return soma / aux.length;
    }

    @Override
    public boolean existe(double[] array, double valor) {
        for (double encontraVal : array) {
            if (encontraVal == valor) {
                return true;
            }
        }
        return false;
    }
}