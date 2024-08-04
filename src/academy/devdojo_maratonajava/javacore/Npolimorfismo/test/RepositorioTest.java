package academy.devdojo_maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo_maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devdojo_maratonajava.javacore.Npolimorfismo.service.RepositorioBancodeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List <String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
