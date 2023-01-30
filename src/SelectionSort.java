public class SelectionSort {
    private int[] array;
    public SelectionSort(int[] array) {
        this.array = array;
        sort();
    }

    // O(n2) time complexity
    // O(1) space complexity
    private void sort() {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
