package academy.devdojo_maratonajava.introdução;

public class FocoTotal6_EstruturasDeRepetição02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int i = 0;
        while (i < 1000000){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        // segunda forma
        for (i = 0;i<1000000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
