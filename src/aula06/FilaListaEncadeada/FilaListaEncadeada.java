package aula06.FilaListaEncadeada;

import aula06.Fila;

public class FilaListaEncadeada implements Fila {
    private Node primeiro;
    private Node ultimo;
    private int tamanho;

    public FilaListaEncadeada() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
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
        Node atual = primeiro;
        while (atual != null) {
            if (atual.dado == dado) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    @Override
    public void inserir(int dado) {
        Node novoNo = new Node(dado);
        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
        tamanho++;
    }

    @Override
    public int retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        int elementoRemovido = primeiro.dado;
        primeiro = primeiro.proximo;
        tamanho--;
        return elementoRemovido;
    }

    @Override
    public void imprimir() {
        Node atual = primeiro;
        System.out.print("[");
        while (atual != null) {
            if (atual.proximo == null) {
                System.out.print(atual.dado);
            } else {
                System.out.print(atual.dado + ", ");
            }
            atual = atual.proximo;
        }
        System.out.println("]");
    }

}
