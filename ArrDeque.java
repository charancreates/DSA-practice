import java.util.ArrayDeque;

public class ArrDeque {
    public static void main(String[] args) {
        // doubly ended queue
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(1200);
        adq.offerFirst(1);
        adq.offerLast(34); // same as offer
        adq.offer(120);

        // peekFirst peekLast pollLast pollFirst

        System.out.println(adq);

    }
}
