package academy.devdojo_maratonajava.javacore.Npolimorfismo.service;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");

    }
}
