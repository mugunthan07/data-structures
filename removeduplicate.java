import java.util.*;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,1,6,2,8,2,8,1,4,2};
        duplicate(arr);
    }
    static void duplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

            System.out.print(set +" ");

    }
}
