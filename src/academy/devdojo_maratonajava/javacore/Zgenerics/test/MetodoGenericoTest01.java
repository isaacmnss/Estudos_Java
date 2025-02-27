package academy.devdojo_maratonajava.javacore.Zgenerics.test;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Lancha"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}
