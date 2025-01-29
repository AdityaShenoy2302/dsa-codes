// brute force
// O(n^3)

public class maxSubarraySum1 {
    public static int maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8 };
        int maxSum = maxSubarraySum(nums);
        System.out.println("max sum: " + maxSum);
    }
}
