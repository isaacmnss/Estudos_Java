package academy.devdojo_maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade; // Não pode ser executado através de polimorfismo da SuperClasse
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
