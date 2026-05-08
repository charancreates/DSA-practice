import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1232);
        list.add(712);
        list.add(1);
        list.add(9);
        list.add(9);
        list.add(79);
        list.add(9);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<student> S = new ArrayList<>();

        S.add(new student("yoyo", 3));
        S.add(new student("virat", 2));
        S.add(new student("ronaldo", 5));
        S.add(new student("gayle", 1));
        S.add(new student("abd", 1));

        System.out.println(S);
        Collections.sort(S, (o1, o2) -> o1.rollNo - o2.rollNo);
        Collections.sort(S, (o1, o2) -> o1.name.compareTo((o2.name)));
        System.out.println(S);
    }
}
