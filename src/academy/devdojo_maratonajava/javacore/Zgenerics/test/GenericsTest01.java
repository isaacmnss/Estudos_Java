package academy.devdojo_maratonajava.javacore.Zgenerics.test;

import academy.devdojo_maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Midoriya");
        list.add(123L);
        list.add(new Consumidor("Isaac"));

        for (Object o : list) {
            if (o instanceof String){
                System.out.println(o);
            }

            if (o instanceof Long){
                System.out.println(o);
            }

            if (o instanceof Object){
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
        }

    }
}
