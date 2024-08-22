package academy.devdojo_maratonajava.javacore.Isobrescrita.test;

import academy.devdojo_maratonajava.javacore.Isobrescrita.domain.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anime anime =  new Anime (sc.nextLine());


        System.out.println(anime);
    }
}
