import java.util.ArrayList;

public class intersectionarr {
    public static void main(String[] args) {
            int[] arr1 ={1,2,3,3,4,5};
            int[] arr2 = {3,3,4,5};

            intersection(arr1,arr2);
    }
    static void intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                arr3.add(arr2[j]);
                i++;
                j++;
            }
        }
        for ( i = 0; i < arr3.size(); i++) {
            System.out.print(arr3.get(i) + " ");
        }
    }
}
