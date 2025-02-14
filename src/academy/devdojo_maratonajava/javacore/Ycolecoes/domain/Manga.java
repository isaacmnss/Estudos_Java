package academy.devdojo_maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;

    public Manga() {
    }

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome,"Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public int compareTo(Manga outroManga) {
        if(this.id < outroManga.getId()){
            return -1;
        } else if (this.id.equals(outroManga.getId())){
            return 0;
        }else {
            return 1;
        }
    }
}
