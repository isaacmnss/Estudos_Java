package academy.devdojo_maratonajava.javacore.Herança.test;

import academy.devdojo_maratonajava.javacore.Herança.domain.Endereço;
import academy.devdojo_maratonajava.javacore.Herança.domain.Funcionario;
import academy.devdojo_maratonajava.javacore.Herança.domain.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua Mariano Procópio, 37");
        endereço.setCep("3000000");
        Pessoa pessoa = new Pessoa("Senhor300");

        pessoa.setCpf("300");
        pessoa.setEndereço(endereço);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda");
        funcionario.setCpf("23114124");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(2000);
        System.out.println("================");
        funcionario.imprime();
    }
}
