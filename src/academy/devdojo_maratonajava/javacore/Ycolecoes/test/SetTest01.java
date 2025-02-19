package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga( 4L,"One Piece", 32.5, 0));
        mangas.add(new Manga( 2L,"Berserk", 32.5, 5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5, 0));
        mangas.add(new Manga( 5L,"Naruto", 32.5, 2));
        mangas.add(new Manga( 3L,"Bleach", 32.5, 0));


        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
