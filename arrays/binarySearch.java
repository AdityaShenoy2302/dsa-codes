// array has to be sorted either ascending or descending
// O(logn)

public class binarySearch {
    public static int binSearch(int nums[], int key) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8 };
        int key = 4;
        System.out.println("index of key is: " + binSearch(nums, key));
    }
}
