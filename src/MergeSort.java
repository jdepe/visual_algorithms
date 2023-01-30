public class MergeSort {
    private int[] array;
    public MergeSort(int[] array) {
        this.array = array;
        merge(array, 0, array.length - 1);
    }

    // O(n*logn) time complexity
    // O(n) space complexity
    private void sort(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + 1];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[q + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
    }

    private void merge(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // m is the split of the arrays

            merge(arr, l, m);
            merge(arr, m + 1, r);

            sort(arr, l, m, r);
        }
    }
}
