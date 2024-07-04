package academy.devdojo_maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraDoTecladoTest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String entrada = input.nextLine();
        if (entrada.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }


    }


}
