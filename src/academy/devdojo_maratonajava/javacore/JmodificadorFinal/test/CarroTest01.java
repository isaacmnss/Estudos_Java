package academy.devdojo_maratonajava.javacore.JmodificadorFinal.test;

import academy.devdojo_maratonajava.javacore.JmodificadorFinal.domain.Carro;
import academy.devdojo_maratonajava.javacore.JmodificadorFinal.domain.Comprador;
import academy.devdojo_maratonajava.javacore.JmodificadorFinal.domain.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Subaru subaru = new Subaru();
        subaru.setNome("XV");
        subaru.imprime();

    }
}
