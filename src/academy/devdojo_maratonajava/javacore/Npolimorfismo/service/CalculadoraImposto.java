package academy.devdojo_maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto  =  produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate)produto).getDataValidade();
            //Tomate tomate = (Tomate) produto;
            System.out.println(dataValidade);
            //System.out.println(tomate.getDataValidade());
        }

    }
}
