import java.util.ArrayList;
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr= {1,4,6,8,3,9,2};
        int n = arr.length;
        int low = arr[0];
        int high = arr.length - 1;
        int mid=0;
         sort(arr,n,mid,low,high);

            System.out.print(Arrays.toString(arr));


    }
    static void sort(int[] arr, int n,int mid, int low, int high) {
        if(low>=high) return;
         mid = (low+high) /2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }



    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = low + (high - low) / 2;

            // Sort first and second halves
            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);

        }

    }

    static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left= low;
        int right=mid+1;

        while(left<=mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);


        }




    }



}
