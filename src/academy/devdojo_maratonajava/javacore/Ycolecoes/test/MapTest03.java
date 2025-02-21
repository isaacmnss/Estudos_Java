package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga( 4L,"One Piece", 15.99);
        Manga manga2 = new Manga( 2L,"Berserk", 21.50);
        Manga manga3 = new Manga( 1L,"Fullmetal Alchemist", 19.90);
        Manga manga4 = new Manga( 5L,"Naruto", 22.0);
        Manga manga5 = new Manga( 3L,"Bleach", 27.90);


        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        List<Manga> mangaConsumidor1List = List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumidor2List = List.of(manga1,manga4,manga5);

        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);



        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println(manga);
            }
        }
    }
}
