package Search_Algorithms;

public class LinearSearch {
    public static int search(int[] arr, int target) {
        for( int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 2, 1, 4, 5, 10, 18, 20};
        System.out.println(search(array1, 10));
    }
}
