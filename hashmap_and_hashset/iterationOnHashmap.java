import java.util.*;

public class iterationOnHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 50);
        map.put("UK", 200);
        map.put("China", 300);
        map.put("Nepal", 5);

        // iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ", value=" + map.get(k));
        }
    }
}
