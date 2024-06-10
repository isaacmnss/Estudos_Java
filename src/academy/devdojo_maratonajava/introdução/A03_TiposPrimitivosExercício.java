package academy.devdojo_maratonajava.introdução;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salario de <salario>, na data de <data>.
 */

public class A03_TiposPrimitivosExercício {
    public static void main(String[] args) {
        String name = "Isaac";
        String adress = "Rua Mariano Procópio, 37";
        float salario = 2500.52f;
        String paymentDate = "01/05/2024";

        System.out.println("Eu "+name+", morando no endereço " +adress+ " confirmo que recebi o salário de R$" +salario+ " na data de "+ paymentDate +".");
    }

}
