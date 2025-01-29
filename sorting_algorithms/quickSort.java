// average TC: O(nlogn)
// worst TC: O(n^2)
// SC: O(1)
// pivot = last element
// worst case occurs when pivot is always smallest or largest element

public class quickSort {
    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void quickSortAlgo(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSortAlgo(arr, si, pIdx - 1);
        quickSortAlgo(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        quickSortAlgo(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
