import java.util.*;

public class hashsetOperations {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        if (set.contains(2)) {
            System.out.println("2 is present in the set");
        }
        if (set.contains(3)) {
            System.out.println("3 is present in the set");
        }

        set.remove(2);
        System.out.println(set);

        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());

        System.out.println(set.isEmpty());

    }
}
