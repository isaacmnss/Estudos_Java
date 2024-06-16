package academy.devdojo_maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo_maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
