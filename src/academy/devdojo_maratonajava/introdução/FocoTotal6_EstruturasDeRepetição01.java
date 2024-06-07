package academy.devdojo_maratonajava.introdução;

public class FocoTotal6_EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }
        // do-while executa o comando pelo menos uma vez
        count =0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        }while (count < 10);

        for (count = 0; count<10; count++) {
            System.out.println("For " + count);
        }
    }
}
