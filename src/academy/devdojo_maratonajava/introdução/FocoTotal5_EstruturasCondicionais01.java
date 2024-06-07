package academy.devdojo_maratonajava.introdução;

public class FocoTotal5_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 21;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        else {
            System.out.println("envelheça");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("envelheça");
        }
        boolean c = true;
        if (c = false){
            System.out.println("Algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");



    }
}
