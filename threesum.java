import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,-1,-3,5,6,2,9,-1,-2};
        int n = arr.length;
        int t = 7;
        threeSum(arr,t,n);
    }
    static void threeSum(int[] arr, int t, int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if( i==0 || arr[i] != arr[i-1]){
                int j=i+1, k = n-1;
                int tar = t-arr[i];
                while(j < k){
                    if(arr[j] + arr[k] == tar){
                        System.out.println(arr[i] +" " + arr[j]+ " " + arr[k]);

                        while(j < k && arr[j] == arr[j+1]) j++;
                        while(j < k && arr[k] == arr[k-1]) k--;
                        j++;
                        k--;

                    }else if(arr[j] + arr[k] < t){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
    }
}
