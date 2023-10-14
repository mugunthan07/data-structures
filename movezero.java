import java.util.Arrays;

public class movezero {

    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 7, 9, 4, 0, 1, 4, 0, 3, 0};
        zero(arr);

    }

    static void zero(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
            while (k<n){
                temp[k]=0;
                k++;
            }
for (int i=0;i<n;i++) {
    System.out.println(temp[i]);
}
    }
}
