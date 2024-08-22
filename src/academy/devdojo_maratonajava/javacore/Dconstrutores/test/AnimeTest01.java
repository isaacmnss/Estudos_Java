package academy.devdojo_maratonajava.javacore.Dconstrutores.test;

import academy.devdojo_maratonajava.javacore.Dconstrutores.domain.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
