package academy.devdojo_maratonajava.javacore.Oexception.exception.test;

import academy.devdojo_maratonajava.javacore.Oexception.exception.domain.Funcionario;
import academy.devdojo_maratonajava.javacore.Oexception.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
