package SortingAlgorithms;

// time complexity = O(n log n)
public class QuickSort {
    public static void quicksort(int[] arr) {
        qs(arr, 0, arr.length - 1);
    }

    public static void qs(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);

        qs(arr, l, p - 1);
        qs(arr, p+1, r);
    }

    public static int partition(int[] arr, int l, int r) {
        // choosing the last element as the pivot
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i += 1;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[r]
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        // return index of pivot
        return i + 1;
    }

    public static void main(String[] args) {
        int[] x = {3, 4, 1, 2, 5};
        quicksort(x);

        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
    }

}
