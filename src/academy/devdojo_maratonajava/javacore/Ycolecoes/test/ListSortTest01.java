package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga( 4L,"One Piece", 32.5));
        mangas.add(new Manga( 2L,"Berserk", 32.5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5));
        mangas.add(new Manga( 5L,"Naruto", 32.5));
        mangas.add(new Manga( 3L,"Bleach", 32.5));


        Collections.sort(mangas);

    }
}
