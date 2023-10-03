package aula02.ExercicioO_N;

public class Teste2 {
    public static void main(String[] args) {
        VetorArray vetor = new VetorArray();
        double[] array = {1, 2, 3, 4, 5};
        // METODO MEDIA
        System.out.println(vetor.media(array));
        // METODO EXISTE
        System.out.println(vetor.existe(array, 3));
    }
}
