import java.util.ArrayList;

public class posandneg {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -9, -1, 5};
        alterposneg(arr);
    }

    static void alterposneg(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n/2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);


    }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
}
}
