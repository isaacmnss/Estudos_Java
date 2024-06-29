package academy.devdojo_maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo_maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Isaac";
        pessoa.setNome("Isaac");
        //pessoa.idade = -1;
        pessoa.setIdade(21);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
