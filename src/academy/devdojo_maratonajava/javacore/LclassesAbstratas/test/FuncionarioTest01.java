package academy.devdojo_maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo_maratonajava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import academy.devdojo_maratonajava.javacore.LclassesAbstratas.domain.Funcionario;
import academy.devdojo_maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);;
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toyota", 7000);
        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}
