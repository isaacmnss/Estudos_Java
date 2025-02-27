package academy.devdojo_maratonajava.javacore.Zgenerics.domain;

public class Barco {
    private String nome;

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Barco(String nome) {
        this.nome = nome;
    }
}
