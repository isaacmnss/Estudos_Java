package academy.devdojo_maratonajava.javacore.Zgenerics.domain;

public class Carro {
    private String nome;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }
}
