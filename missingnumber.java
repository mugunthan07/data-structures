import java.util.HashMap;

public class missingnumber {
    public static void  num(int[] arr){
        HashMap<Integer,Integer> arr1 = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            arr1.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr1.containsValue(i)) {
                System.out.println(i);

            }
        }
        System.out.println("array is complete array");

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        num(arr);
          int[] a = {1,2,3,4,5};
        System.out.println(a.length);
    }
}
