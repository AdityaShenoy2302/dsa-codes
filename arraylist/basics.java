import java.util.ArrayList;
import java.util.Collections;

public class basics {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9); // O(n)
        System.out.println(list);
        Collections.sort(list);

        // get operation
        int ele = list.get(2);
        System.out.println(ele);

        // delete operation
        list.remove(2);
        System.out.println(list);

        // set operation
        list.set(2, 10);
        System.out.println(list);

        // contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // size
        System.out.println(list.size());

    }
}