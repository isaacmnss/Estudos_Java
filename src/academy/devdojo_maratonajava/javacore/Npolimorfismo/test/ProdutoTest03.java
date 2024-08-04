package academy.devdojo_maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
