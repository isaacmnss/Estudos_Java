package academy.devdojo_maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("########################");
        Produto produto2 = new Tomate("Tomate americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
