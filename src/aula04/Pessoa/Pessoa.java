package aula04.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String toString() {
        return nome + " (" + idade + " Anos)";

    }

    public static void main(String[] args) {
        Pessoa[] pessoas = {
                new Pessoa("Alice", 30),
                new Pessoa("Renata", 25),
                new Pessoa("Joao", 30)
        };

    }
}
