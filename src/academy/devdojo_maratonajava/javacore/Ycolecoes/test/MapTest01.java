package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("tc", "teclado");
        map.put("ts", "this");
        map.put("vc", "você");
        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("-------------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
