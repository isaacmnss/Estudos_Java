package academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain;

public class Seminário {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;


    public Seminário(String título) {
        this.titulo = título;
    }

    public Seminário(String titulo, Estudante[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminário(String titulo, Estudante[] estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
