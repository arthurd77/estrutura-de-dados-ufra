package aula06.FilaListaEncadeada;

public class App {
    public static void main(String[] args) {
        FilaListaEncadeada fila = new FilaListaEncadeada();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        System.out.println("Tamanho da fila: " + fila.tamanho()); // Saída: Tamanho da fila: 3
        System.out.println("A fila está vazia? " + fila.estaVazia()); // Saída: A fila está vazia? false
        System.out.println("A fila contém o número 20? " + fila.contem(20)); // Saída: A fila contém o número 20? true
        System.out.print("Elementos na fila: ");
        fila.imprimir(); // Saída: Elementos na fila: 10 20 30

        int elementoRemovido = fila.retirar();
        System.out.println("Elemento removido: " + elementoRemovido); // Saída: Elemento removido: 10

        fila.imprimir(); // Saída: Elementos na fila: 20 30
    }
}