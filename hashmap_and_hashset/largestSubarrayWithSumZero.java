// sum[i+1, j] = sum[0, j] - sum[0, i]
// 0 = sum[0, j] - sum[0, i]
// sum[0, j] = sum[0, i] -> use hashmap

import java.util.*;

public class largestSubarrayWithSumZero {
    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        HashMap<Integer, Integer> map = new HashMap<>(); // (sum, idx)

        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = j - map.get(sum);
            } else {
                map.put(sum, j);
            }
        }

        System.out.println("Length of largest subarray with sum 0 => " + len);
    }
}
