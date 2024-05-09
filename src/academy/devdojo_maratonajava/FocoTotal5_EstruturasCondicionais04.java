package academy.devdojo_maratonajava;

public class FocoTotal5_EstruturasCondicionais04 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 7;
        // char, int. byte, short, enum, String
        switch (dia){
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            default:
                System.out.println("Opção Inválida");
            case 'M':
                System.out.println("Homem");
            case 'F':
                System.out.println("Mulher");
        }
    }
}
