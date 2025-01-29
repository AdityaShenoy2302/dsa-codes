public class largestNumber {
    public static int largest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8 };
        int max = largest(nums);
        System.out.println("Max element: " + max);
    }
}
