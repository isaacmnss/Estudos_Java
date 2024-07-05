package academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Seminário seminário;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, int idade) {
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
}
