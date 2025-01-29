// ides: pick first element from unsorted array and places it in the right pos in sorted array
// O(n^2)
// best case: O(n) - when array is already sorted

public class InsertionSort {
    public static void insertionSortAlg(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && nums[prev] > temp) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev + 1] = temp;

        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };
        insertionSortAlg(nums);
        printArray(nums);
    }
}
