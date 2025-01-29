// Total subarrays: (n*(n+1)) / 2

public class subarrays {
    public static void printSubarrays(int nums[]) {
        int ts = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) { // print
                    System.out.print(nums[k] + " "); // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8 };
        printSubarrays(nums);
    }
}
