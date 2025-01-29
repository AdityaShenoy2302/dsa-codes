public class firstOccurence {
    public static int firstOcc(int nums[], int key, int i) {
        if (i == nums.length) {
            return -1;
        }
        if (nums[i] == key) {
            return i;
        }

        return firstOcc(nums, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9 };
        System.out.println(firstOcc(arr, 6, 0));
    }
}
