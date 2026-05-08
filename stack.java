import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("tiger");

        System.out.println("stack: " + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("stack: " + animals);
        System.out.println(animals.peek());

    }
}
