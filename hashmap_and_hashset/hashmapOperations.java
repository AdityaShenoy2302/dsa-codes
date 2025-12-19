// hashmaps are unordered maps in java

import java.util.*;

public class hashmapOperations {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> map = new HashMap<>();

        // insert - O(1)
        map.put("India", 100);
        map.put("USA", 50);
        map.put("China", 300);

        System.out.println(map);

        // get - O(1)
        int population = map.get("India");
        System.out.println(population);
        System.out.println(map.get("Indonesia"));

        // containsKey - O(1)
        System.out.println(map.containsKey("USA"));
        System.out.println(map.containsKey("Japan"));

        // remove - O(1)
        System.out.println(map.remove("China"));
        System.out.println(map.remove("Indonesia"));

        // size
        System.out.println(map.size());

        // isEmpty
        System.out.println(map.isEmpty());

        // clear
        map.clear();
        System.out.println(map.isEmpty());

    }
}