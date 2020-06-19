package linkedhashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        PriorityQueue<MyData> queue = new PriorityQueue<>((p1, p2) -> p2.createdAt - p1.createdAt);
        queue.add(new MyData(1, 1));
        queue.add(new MyData(1, 2));
        queue.add(new MyData(1, 3));
        queue.add(new MyData(2, 6));
        queue.add(new MyData(2, 5));
        queue.add(new MyData(2, 4));

        Set<MyData> linkedHashSet = new LinkedHashSet<>();
        while (!queue.isEmpty()) {
            MyData myData = queue.poll();
            linkedHashSet.add(myData);
        }
        System.out.println(linkedHashSet);

    }
}
