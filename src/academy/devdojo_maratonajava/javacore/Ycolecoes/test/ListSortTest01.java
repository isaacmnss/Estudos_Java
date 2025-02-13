package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One Piece");
        mangas.add("Berserk");
        mangas.add("Fullmetal Alchemist");
        mangas.add("Naruto");
        mangas.add("Bleach");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
