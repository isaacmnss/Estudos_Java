package academy.devdojo_maratonajava.javacore.Kenum.test;

import academy.devdojo_maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo_maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Javier", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Javier", TipoCliente.PESSOA_FISICA); // propositalmente errado
        Cliente cliente3 = new Cliente("Conect", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Conect", TipoCliente.PESSOA_JURIDICA); // propositalmente errado
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
