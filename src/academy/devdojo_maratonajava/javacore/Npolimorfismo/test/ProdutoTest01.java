package academy.devdojo_maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 7000);
        Tomate tomate = new Tomate("Tomate verde", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("####################################");
        CalculadoraImposto.calcularImpostoComputador(tomate);
    }
}
