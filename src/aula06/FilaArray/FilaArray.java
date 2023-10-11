package aula06.FilaArray;

import aula06.Fila;

public class FilaArray implements Fila {
    private int[] array;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean contem(int dado) {
        for (int i = 0; i < tamanho; i++) {
            if (array[(inicio + i) % capacidade] == dado) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void inserir(int dado) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia");
        }
        fim = (fim + 1) % capacidade;
        array[fim] = dado;
        tamanho++;
    }

    @Override
    public int retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        int elementoRemovido = array[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elementoRemovido;
    }

    @Override
    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fila fila = new FilaArray(3);

        fila.inserir(5); //
        fila.inserir(3); //
        fila.inserir(2); //

        System.out.println("Tamanho da fila: " + fila.tamanho()); // O tamanho da fila se encontra com a sua capacidae em 3
        System.out.println("A fila está vazia? " + fila.estaVazia()); // A fila não se encontra vazia (false)
        System.out.println("A fila contém o número 10? " + fila.contem(10)); // A fila não contem o numero 10, logo será retornará (false)

        System.out.print("Elementos na fila: "); // O mesmo retornará os elementos presentes na fila
        fila.imprimir();

        int elementoRemovido = fila.retirar(); // Neste caso, será retornado os elementos removidos da fila.
        System.out.println("Elemento removido: " + elementoRemovido);
        fila.imprimir();
    }
}