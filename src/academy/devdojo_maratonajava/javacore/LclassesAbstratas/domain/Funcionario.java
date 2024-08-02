package academy.devdojo_maratonajava.javacore.LclassesAbstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus(); // Não pode ter corpo.
    // As classes filhas precisam prover a implementação desse método
    // Métodos abstratos só podem existir em classes abstratas



}
