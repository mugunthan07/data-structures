import java.util.ArrayList;
import java.util.Arrays;

public class leader {
    public static void main(String[] args) {
        int[] arr = {1,3,4,9,7,0};
        rightbig(arr);
    }
    static void rightbig(int[] arr){

     int n = arr.length;
        ArrayList<Integer> arr1 = new ArrayList<>();

     for(int i=0;i<n;i++){
         boolean l = true;
         for(int j=i+1;j<n;j++){
             if(arr[j] > arr[i])
              l = false;
             break;


         }
         if (l)
             arr1.add(arr[i]);
     }
     for(int i=0;i< arr1.size();i++) {
         System.out.println(arr1.get(i));
     }
    }
}
