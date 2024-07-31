package academy.devdojo_maratonajava.javacore.Herança.test;

import academy.devdojo_maratonajava.javacore.Herança.domain.Funcionario;

public class HerançaTest02 {
    public static void main(String[] args) {
        Funcionario Funcionario = new Funcionario("Jiraya");
    }
}
/* JVM tenta carregar Classe Funcionário, mas para isso, precisa carregar Classe Pessoa, assim inicializado o bloco
 estático de Pessoa. Após isso é inicializado o bloco estático de Funcionário. Para construir a classe Funcionário,
É necessário ter finalizado de construir a classe Pessoa, e executar todos os seus construtores.
 */