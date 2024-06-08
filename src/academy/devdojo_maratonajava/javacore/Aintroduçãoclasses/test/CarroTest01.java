package academy.devdojo_maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo_maratonajava.javacore.Aintroduçãoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Celta";
        carro.modelo = "LT Flex";
        carro.ano = 2014;
        Carro carro1 = new Carro();
        carro1.nome = "Corolla";
        carro1.modelo = "LTZ";
        carro1.ano = 2020;
        System.out.println("Carro 1: " + carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("\n####################");
        System.out.println("\n"+ "Carro 2: "+carro1.nome + " " + carro1.modelo+ " " + carro1.ano);
    }
}
