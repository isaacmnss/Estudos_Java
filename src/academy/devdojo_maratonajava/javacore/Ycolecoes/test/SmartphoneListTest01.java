package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AB1C", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Samsung");
        Smartphone s3 = new Smartphone("33333", "Xiaomi");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Samsung");
        System.out.println(smartphones.contains(s4));
        smartphones.indexOf(s4);
    }
}
