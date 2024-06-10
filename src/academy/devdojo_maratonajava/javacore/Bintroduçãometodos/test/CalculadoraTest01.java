package academy.devdojo_maratonajava.javacore.Bintroduçãometodos.test;

import academy.devdojo_maratonajava.javacore.Bintroduçãometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
