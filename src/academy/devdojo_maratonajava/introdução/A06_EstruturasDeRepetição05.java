package academy.devdojo_maratonajava.introdução;

public class A06_EstruturasDeRepetição05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            System.out.println("Parcelamento: " + parcela + "x Valor da parcela: " + " R$" + valorParcela);
        }
    }
}