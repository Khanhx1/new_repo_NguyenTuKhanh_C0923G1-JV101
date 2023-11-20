package ss12_thuat_toan_tim_kiem.bai_tap;

public class BinarySearchWithRecursion {
    private static int binarySearch(int[] arr, int low, int hight, int value) {
        if (low <= hight) {
            int mid = (low + hight) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, hight, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 7));
    }
}
