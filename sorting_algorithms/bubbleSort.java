// idea: large elements come to the end of the array by swapping with adj elements
// n-1 turns
// O(n^2) => worst case
// O(n) => best case => sorted array as input

public class bubbleSort {
    public static void bubbleSortAlg(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            int swaps = 0;
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    swaps++;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };
        bubbleSortAlg(nums);
        printArray(nums);
    }
}