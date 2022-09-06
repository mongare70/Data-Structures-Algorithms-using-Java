package SortingAlgorithms;

// Average time complexity of O(n^2)
public class SelectionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n-2; i++) {
            int iMin = i;
            for (int j = i+1; j < n-1; j++) {
                if (arr[j] < arr[iMin]) {
                    iMin = j;
                }
            } 

            // swap
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 5, 6, 9, 10};
        sort(x, x.length);

        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
    }
}
