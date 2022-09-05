package Search_Algorithms;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = Math.round(left+right / 2);

            if (arr[mid] == target) {
                return mid;
            }

            else if (target < arr[mid]) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(array1, 10));
    }
}
