import Vetor.VetorImp;

public class MainVetor {
    public static void main(String[] args) {
        VetorImp vetor = new VetorImp();
        int[] numeros = {1, 3, 4, 5};
        System.out.println("SOMA TOTAL: " + vetor.soma(numeros));
        System.out.println("MÉDIA: " + vetor.media(numeros));
    }
}
