package academy.devdojo_maratonajava.introdução;

public class A05_EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            default:
                System.out.println("Opção Inválida");
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda, dia útil");
                break;
            case 3:
                System.out.println("Terça, dia útil");
                break;
            case 4:
                System.out.println("Quarta, dia útil");
                break;
            case 5:
                System.out.println("Quinta, dia útil");
                break;
            case 6:
                System.out.println("Sexta, dia útil");
                break;
            case 7:
                System.out.println("Sábado com Gilberto Barros, é SABADASSO");
                break;
        }
        // segunda forma
        switch (dia){
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }

    }
}
