// kadane's algorithm
// O(N)

public class maxSubarraySum3 {
    public static int kadanes(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = kadanes(numbers);
        System.out.println("max sum: " + max);
    }
}
