package academy.devdojo_maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo_maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Isaac");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
