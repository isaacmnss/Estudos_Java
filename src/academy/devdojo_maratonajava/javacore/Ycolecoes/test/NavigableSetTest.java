package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Apple");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga( 4L,"One Piece", 32.5));
        mangas.add(new Manga( 2L,"Berserk", 7.99));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 20.99));
        mangas.add(new Manga( 5L,"Naruto", 3.25));
        mangas.add(new Manga( 3L,"Bleach", 6.10));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga yuy = new Manga(7L, "Yu Yu Hakusho", 10.99);

        System.out.println("----------");
        System.out.println(mangas.lower(yuy));
        System.out.println(mangas.higher(yuy));
        System.out.println(mangas.floor(yuy));
        System.out.println(mangas.ceiling(yuy));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
