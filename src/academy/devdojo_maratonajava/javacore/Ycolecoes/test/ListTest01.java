package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Isaac");
        nomes.add("Meneses");
        nomes2.add("Devdojo");
        nomes2.add("Academy");



        for(Object nome : nomes){
            System.out.println(nome);
        }

        System.out.println("------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }

}
