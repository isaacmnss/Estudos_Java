package academy.devdojo_maratonajava.javacore.Aintroducaoclasses.test;


import academy.devdojo_maratonajava.javacore.Aintroducaoclasses.domain.Estudante;
// importando classe pública

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // variável de referência para ao objeto estudante
        estudante.nome = "Isaac";
        estudante.sexo = 'M';
        estudante.idade = 21;
        // preenchendo campos presentes na classe estudante
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
