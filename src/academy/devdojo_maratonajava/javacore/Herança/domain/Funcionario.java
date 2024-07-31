package academy.devdojo_maratonajava.javacore.Herança.domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }
   public  Funcionario(String nome){
       super(nome);
       System.out.println("Dentro do construtor de Funcionário");
   }

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.getNome()+ "recebi o salário de "+ this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
