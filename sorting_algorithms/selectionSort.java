// idea: pick the smallest from the unsorted array and put it at the beginning
//O(n^2)

public class selectionSort {
    public static void selectionSortAlg(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };
        selectionSortAlg(nums);
        printArray(nums);
    }
}
