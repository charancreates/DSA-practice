import java.util.HashMap;
import java.util.Map;

public class mapstring {
    public static void main(String[] args) {
        String s = "aahhhhhyiyi";

        HashMap<Character, Integer> mpp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(mpp);

        for (var entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
