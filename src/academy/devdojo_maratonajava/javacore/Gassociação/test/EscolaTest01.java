package academy.devdojo_maratonajava.javacore.Gassociação.test;

import academy.devdojo_maratonajava.javacore.Gassociação.domain.Escola;
import academy.devdojo_maratonajava.javacore.Gassociação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Iruka");
        Professor[] professores = {professor, professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
