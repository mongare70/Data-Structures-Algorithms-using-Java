package SortingAlgorithms;

// time complexity is O(n log n)
public class MergeSort {
    // function to get slice of array
    public static int[] getSliceofArray(int[] arr, int start, int end) {
        // get slice of array
        int[] slice = new int[end - start];

        //copy elements of array to slice;
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        return slice;
    }


    public static void merge(int[] left, int[] right, int[] arr) {
        int i, j, k;
        i = j = k = 0;

        // copy data to temporary arrays left[] and right[]
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }

            k = k + 1;
        }

        // checking if any element was left in the left array
        while (i < left.length) {
            arr[k] = left[i];
            i = i + 1;
            k = k + 1;
        }

        // checking if any element was left in the right array
        while (j < right.length) {
            arr[k] = right[j];
            j = j + 1;
            k = k + 1;
        }
    }

    public static void sort(int[] arr) {
        if (arr.length > 1) {
            int mid = Math.floorDiv(arr.length, 2);
            int[] left = getSliceofArray(arr, 0, mid);
            int[] right = getSliceofArray(arr, mid, arr.length);

            sort(left);
            sort(right);
            merge(left, right, arr);
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 5, 6, 9, 10};
        sort(x);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
    }
}
