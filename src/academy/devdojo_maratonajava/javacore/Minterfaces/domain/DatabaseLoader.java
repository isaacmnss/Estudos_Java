package academy.devdojo_maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
