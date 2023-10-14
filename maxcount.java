import java.util.Arrays;

class maxcount {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 5};
        mincount(arr);
    }

    static void mincount(int[] arr) {
        int[] arr1 = new int[arr.length];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {

                    count++;

                }

            }
            arr1[i] += count;


            System.out.print(arr1[i] + " ");
        }
    }
}