package academy.devdojo_maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("B");
        queue.add("A");
        queue.add("C");
        for (String string : queue) {
            System.out.println(string);
        }

    }
}
