package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga( 4L,"One Piece", 15.99);
        Manga manga2 = new Manga( 2L,"Berserk", 21.50);
        Manga manga3 = new Manga( 1L,"Fullmetal Alchemist", 19.90);
        Manga manga4 = new Manga( 5L,"Naruto", 22.0);
        Manga manga5 = new Manga( 3L,"Bleach", 27.90);


        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " -> " + entry.getValue().getNome());
        }
    }
}
