package academy.devdojo_maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo_maratonajava.javacore.Aintroduçãoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Celta";
        carro.modelo = "LT Flex";
        carro.ano = 2014;

        carro1.nome = "Corolla";
        carro1.modelo = "LTZ";
        carro1.ano = 2020;

        carro = carro1;
        // Agora a VAR carro faz referência ao mesmo objeto carro1, mas isso faz com que os valores de carro sejam perdidos

        System.out.println("Carro 1: " + carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("\n####################");
        System.out.println("\n"+ "Carro 2: "+carro1.nome + " " + carro1.modelo+ " " + carro1.ano);
    }
}
