package academy.devdojo_maratonajava.javacore.Zgenerics.test;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo_maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo_maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClassesGenericasTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.retrieveAvailableBarco();
        System.out.println("Usando o carro...");
        barcoRentavelService.retornarBarco(barco);
    }
}

