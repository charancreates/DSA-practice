import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // uses min heap as default

        pq.offer(1400);
        pq.offer(129);
        pq.offer(14);
        pq.offer(120);

        System.out.println("pQ: " + pq);
        System.out.println(pq.poll());
        System.out.println("pQ: " + pq);

        System.out.println(pq.peek());
        System.out.println("pQ: " + pq);

    }
}
