package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer [] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arraysToList = Arrays.asList(numerosArray);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arraysToList);

        System.out.println("-----------");
        List<Integer> numerosList =  new ArrayList<>(Arrays.asList(numerosArray));
        System.out.println(numerosList);
    }
}
