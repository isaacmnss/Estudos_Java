package academy.devdojo_maratonajava.javacore.Eblocosinicialização.test;

import academy.devdojo_maratonajava.javacore.Eblocosinicialização.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + "");
        }


    }
}
