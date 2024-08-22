package academy.devdojo_maratonajava.javacore.Oexception.runtime.test;

import java.util.Scanner;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
       int resultado = divisao();
        System.out.println(resultado);
    }

    private static int divisao (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a");
        int a =  sc.nextInt();
        System.out.println("Digite o valor b");
        int b = sc.nextInt();
        sc.close();
        if (b == 0){
            throw new IllegalArgumentException("Não é possível dividir por 0");
        }
        return a/b;
    }
}
