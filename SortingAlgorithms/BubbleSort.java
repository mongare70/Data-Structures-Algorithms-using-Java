package SortingAlgorithms;

// Average time complexity of O(n^2)
public class BubbleSort {
    public static void sort(int[] arr, int n) {
        // after n-1 we are guaranteed to be sorted
        for (int j = 1; j < n-1; j++) {
            // n-2 to prevent n+1 falling out of bound

            for (int i = 0; i < n-2; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 5, 6, 9, 10};
        sort(x, x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ,");
        }
        
    }
}
