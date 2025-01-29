// prefix sum -> ith index tak ka pura sum
// O(n^2)
// prefix[end] - prefix[start-1]

public class maxSubarraySum2 {
    public static int maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        // calc prefix array
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int nums[] = { 1, -2, 6, -1, 3 };
        System.out.println("max subarray sum: " + maxSubarraySum(nums));
    }
}
