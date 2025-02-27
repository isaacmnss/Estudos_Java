package academy.devdojo_maratonajava.javacore.Zgenerics.test;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo_maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericasTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.retrieveAvailableObject();
        System.out.println("Usando o carro...");
        rentalService.retornarObjeto(carro);
    }


}
