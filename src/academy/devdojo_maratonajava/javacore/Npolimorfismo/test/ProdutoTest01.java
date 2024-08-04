package academy.devdojo_maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 7000);
        Tomate tomate = new Tomate("Tomate verde", 10);
        Televisao tv = new Televisao("Samsung 50\" ",2200);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("####################################");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("####################################");
        CalculadoraImposto.calcularImposto(tv);
    }
}
