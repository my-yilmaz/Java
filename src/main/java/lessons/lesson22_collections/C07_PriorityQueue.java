package lessons.lesson22_collections;

import java.util.PriorityQueue;

public class C07_PriorityQueue {

    //* PriorityQueue(oncelik) Java kendisine gore bir oncelik belirleyerek siralama yapar, biz soylemedigimiz surece.
    //* Biz istersek siralamayi belirleyebiliriz

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue); // [A, C, B, G, E]

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(3);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        System.out.println(pQueue);

        System.out.println(pQueue.poll()); // Output: 1
        System.out.println(pQueue.poll()); // Output: 2
        System.out.println(pQueue.poll()); // Output: 3

        System.out.println(pQueue);
    }
}
