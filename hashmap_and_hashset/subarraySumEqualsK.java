// sum(i+1, j) = sum(0, j) - sum(0, i)
// sum(i, j) = sum(0, j) - sum(0, i-1)
// k = sum(0, j) - sum(0, i-1)
// sum(0, j) - k = sum(0, i-1) 

import java.util.*;

public class subarraySumEqualsK {
    public static int count(int arr[], int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // (sum, freq)
        map.put(0, 1);
        int sum = 0;
        int ans = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        System.out.println(count(arr, k));
    }
}