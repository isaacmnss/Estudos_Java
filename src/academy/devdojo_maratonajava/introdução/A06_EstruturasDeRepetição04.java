package academy.devdojo_maratonajava.introdução;

public class A06_EstruturasDeRepetição04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição: o Valor da parcela deve ser >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                continue;
            }
            System.out.println("Parcelamento: "+ parcela+ "x Valor da parcela: "+ " R$"+ valorParcela);
        }


    }
}
