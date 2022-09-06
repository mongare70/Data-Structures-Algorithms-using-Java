package SortingAlgorithms;

// Average time complexity of O(n^2)
public class InsertionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 1; i < n-1; i++) {
            int value = arr[i];
            int hole = i;

            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }

            arr[hole] = value;
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 6, 9, 10};
        sort(x, x.length);
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
        
    }
}
