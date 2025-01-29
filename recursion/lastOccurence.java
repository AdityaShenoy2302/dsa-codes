public class lastOccurence {
    public static int lastOcc(int nums[], int key, int i) {
        if (i == nums.length) {
            return -1;
        }

        int isFound = lastOcc(nums, key, i + 1);

        if (isFound == -1 && nums[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 5, 5, 5 };
        System.out.println(lastOcc(arr, 5, 0));
    }
}
