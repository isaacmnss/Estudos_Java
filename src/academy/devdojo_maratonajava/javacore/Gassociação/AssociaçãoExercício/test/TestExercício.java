package academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.test;

import academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain.Estudante;
import academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain.Local;
import academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain.Professor;
import academy.devdojo_maratonajava.javacore.Gassociação.AssociaçãoExercício.domain.Seminário;

public class TestExercício {
    public static void main(String[] args) {
        Local local = new Local("Rua Mariano Procópio, 37");
        Estudante estudante = new Estudante("Pablo");
        Professor professor = new Professor("Whitebeard", "Akuma no mis");
        Estudante[] estudantesSeminario = {estudante};

        Seminário seminario = new Seminário("Logias", estudantesSeminario, local);

        Seminário[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
