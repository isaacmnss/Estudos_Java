package academy.devdojo_maratonajava;

public class FocoTotal5_EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 22;
        if (age < 15){
            System.out.println("Categoria Infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria adulto");
        }
    }
}
