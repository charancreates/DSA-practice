import java.util.LinkedList;
import java.util.Queue;

public class linkedlistQ {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(14);
        queue.offer(120);

        System.out.println("Q: " + queue);
        System.out.println(queue.poll());
        System.out.println("Q: " + queue);

        System.out.println(queue.peek());
        System.out.println("Q: " + queue);
    }

}
