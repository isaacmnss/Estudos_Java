package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga( 4L,"One Piece", 32.5, 0));
        mangas.add(new Manga( 2L,"Berserk", 32.5, 5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5, 0));
        mangas.add(new Manga( 5L,"Naruto", 32.5, 2));
        mangas.add(new Manga( 3L,"Bleach", 32.5, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//           if (mangaIterator.next().getQuantidade() == 0 ){
//                mangaIterator.remove();
//           }
//        }

        mangas.removeIf(manga -> manga.getQuantidade()==0);

        System.out.println(mangas);
    }
}
