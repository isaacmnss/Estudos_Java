package academy.devdojo_maratonajava.javacore.Kenum.test;

import academy.devdojo_maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo_maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devdojo_maratonajava.javacore.Kenum.domain.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Javier", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        Cliente cliente2 = new Cliente("Conect", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
