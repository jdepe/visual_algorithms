public class InsertionSort {
    private int[] array;
    public InsertionSort(int[] array) {
        this.array = array;
        sort();
    }

    // O(n2) time complexity
    // O(1) space complexity
    private void sort() {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = key;
        }
    }
}
