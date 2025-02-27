package academy.devdojo_maratonajava.javacore.Zgenerics.test;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo_maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClassesGenericasTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando o carro...");
        carroRentavelService.retornarCarro(carro);
    }
}
