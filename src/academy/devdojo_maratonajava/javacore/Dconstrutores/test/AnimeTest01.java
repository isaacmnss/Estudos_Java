package academy.devdojo_maratonajava.javacore.Dconstrutores.test;

import academy.devdojo_maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 12, "Ação", "Ufotable");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
