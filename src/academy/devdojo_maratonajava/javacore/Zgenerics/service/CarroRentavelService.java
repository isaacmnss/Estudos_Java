package academy.devdojo_maratonajava.javacore.Zgenerics.service;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro retrieveAvailableCar(){
        System.out.println("Buscando carro disponível....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro: "+carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarro(Carro carro){
        System.out.println("Devolvendo carro: "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
