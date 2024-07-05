package academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminário[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminário[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("==============");
        System.out.println("Professor: "+ this.nome);
        System.out.println("Especialidade: "+ this.especialidade);
        if (seminarios == null) return;
        System.out.println("## Seminários Cadastrados ##");
        for (Seminário seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
            if (seminario.getEstudantes() ==  null) continue;
            System.out.println("** Alunos **");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Aluno: "+ estudante.getNome() + " idade: " + estudante.getIdade());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminário[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminário[] seminarios) {
        this.seminarios = seminarios;
    }
}
