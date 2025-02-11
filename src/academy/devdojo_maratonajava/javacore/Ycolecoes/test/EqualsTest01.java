package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABA2", "Apple");
        Smartphone s2 = new Smartphone("1ABA2", "Apple");
        System.out.println(s1.equals(s2));
    }
}
