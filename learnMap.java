import java.util.*;

public class learnMap {
    public static void main(String[] args) {
        // key value pair
        // Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        // sorted by keys in treemap O(log(n))

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("three", 5); // override

        // numbers.remove("one");

        if (!numbers.containsKey("two")) {
            numbers.put("two", 224);
        }

        System.out.println(numbers.containsValue(2));

        numbers.putIfAbsent("two", 777);

        // iteration
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        System.out.println(numbers);

    }
}
