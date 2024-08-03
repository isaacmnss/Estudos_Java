package academy.devdojo_maratonajava.javacore.Minterfaces.test;

import academy.devdojo_maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo_maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo_maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
