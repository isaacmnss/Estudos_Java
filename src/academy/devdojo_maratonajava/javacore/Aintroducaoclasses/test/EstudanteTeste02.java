package academy.devdojo_maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo_maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sanji";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println("---------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        //
    }
}
