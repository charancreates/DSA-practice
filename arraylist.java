import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(100);
        list2.add(49);
        list2.add(1090);

        System.out.println(list);
        list.add(1, 20);
        System.out.println(list);
        list.remove(Integer.valueOf(100));
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);

        list.set(0, 3000);
        System.out.println(list);

        System.out.println(list.contains(4000));

        System.out.println("\n\nfor loop");
        // iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n\nfor each loop");

        for (Integer element : list) {
            element = element * 2;
            System.out.print(element + " ");
        }

        System.out.println("\n\nItearator");

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        list.clear();
        System.out.println("\n" + list);
    }
}
