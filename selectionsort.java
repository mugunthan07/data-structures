// Selection sort in Java

import java.util.Arrays;

class SelectionSort {
    void selectionSort(int array[]) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < size; j++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }

            // put min at the correct position
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    // driver code
    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}