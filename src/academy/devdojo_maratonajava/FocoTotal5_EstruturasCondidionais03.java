package academy.devdojo_maratonajava;

public class FocoTotal5_EstruturasCondidionais03 {
    public static void main(String[] args) {
        double salario = 10000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salario <=34712){
            valorImposto = salario * primeiraFaixa;
        } else if (salario > 34712 && salario <= 68507) {
            valorImposto = salario * segundaFaixa;
        }else{
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println(valorImposto);


    }
}
