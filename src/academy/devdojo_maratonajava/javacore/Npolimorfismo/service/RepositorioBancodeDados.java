package academy.devdojo_maratonajava.javacore.Npolimorfismo.service;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancodeDados implements  Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");

    }
}
