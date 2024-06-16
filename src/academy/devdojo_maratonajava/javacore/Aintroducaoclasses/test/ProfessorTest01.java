package academy.devdojo_maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo_maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kame";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo + ".");
    }
    // PRINCÍPIO DE COESÃO: De preferência um propósito por classe.
}
