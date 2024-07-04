package academy.devdojo_maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra = input.next();
        // o parãmetro .next lê apenas a próxima palavra digitada no console
        // não retorna frases.
        System.out.println("R: " + palavra);

        System.out.println("----------------------");

        Scanner input2 = new Scanner(System.in);

        String frase = input2.nextLine();
        System.out.println("R: " + frase);
        // .nextLine retorna toda a frase
    }
}
