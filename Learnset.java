import java.util.*;

public class Learnset {
    public static void main(String[] args) {
        // no duplicates,no orders

        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        // hashset random order
        // liskedhashset order maintains
        // Treeset is sorted cz of BST

        set.add(34);
        set.add(343);
        set.add(334);
        set.add(234);
        set.add(3);
        set.add(3);
        set.add(3);

        System.out.println(set);

        set.remove(34);
        System.out.println(set);

        System.out.println(set.contains(3));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
