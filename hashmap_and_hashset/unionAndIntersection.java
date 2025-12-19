import java.util.HashSet;

public class unionAndIntersection {
    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // union
        HashSet<Integer> union = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println("union size = " + union.size());
        System.out.print("union elements: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("intersection elements: ");

        // intersection
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr1) {
            intersection.add(num);
        }

        int count = 0;
        for (int num : arr2) {
            if (intersection.contains(num)) {
                count++;
                System.out.print(num + " ");
                intersection.remove(num);
            }

        }

        System.out.println("intersection size = " + count);
    }
}
