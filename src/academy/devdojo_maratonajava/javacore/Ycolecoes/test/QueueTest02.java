package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga( 4L,"One Piece", 32.5));
        mangas.add(new Manga( 2L,"Berserk", 7.99));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 20.99));
        mangas.add(new Manga( 5L,"Naruto", 3.25));
        mangas.add(new Manga( 3L,"Bleach", 6.10));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
