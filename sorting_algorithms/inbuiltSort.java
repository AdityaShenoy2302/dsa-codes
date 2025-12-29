// O(nlogn)
// Arrays.sort(arr)
// Arrays.sort(arr, si, ei)
// descending order:
// Arrays.sort(arr, Collections.reverseOrder())
// Arrays.sort(arr, si, ei, Collections.reverseOrder()) 
// reverse order function works on objects

import java.util.Arrays;
// import java.util.Collections;

public class inbuiltSort {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };

        // Arrays.sort(nums);
        Arrays.sort(nums, 0, 3);

        printArray(nums);
    }
}
