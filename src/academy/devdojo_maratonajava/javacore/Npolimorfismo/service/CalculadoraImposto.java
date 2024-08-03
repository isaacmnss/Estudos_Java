package academy.devdojo_maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador "+ computador.getNome());
        System.out.println("Valor "+ computador.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }

    public static void calcularImpostoComputador(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador "+ tomate.getNome());
        System.out.println("Valor "+ tomate.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }
}
