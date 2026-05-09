import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mappractice {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 89, 90, 3, 1, 3, 2, 12, 12, 12, 12, 7, 8, 6, 4 };

        int[] qarr = { 1, 2, 3, 4, 12 };
        int q = qarr.length;

        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
            mpp.merge(arr[i], 1, Integer::sum);
        }
        System.out.println(mpp);

        int max = mpp.get(Collections.max(mpp.values()));
        System.out.println("MAX : " + max);

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry);
        }
        for (var entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        while (q != 0) {
            for (int i : qarr) {
                System.out.println(mpp.getOrDefault(i, 0));
                q--;
            }
        }

    }
}
