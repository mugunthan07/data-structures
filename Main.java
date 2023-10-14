import java.util.Arrays;

class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,4,3,7,6,5};
     int t = 6;
     int[] arr1 = twoSum(arr,t);

        System.out.println(arr1[0] + "," + arr1[1]);

    }
static int[] twoSum(int[] arr, int t){

    int[] arr1 = new int[2];
    int n= arr.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i] + arr[j] == t){
               arr1[0] = arr[i];
               arr1[1] = arr[j];
                return arr1;
            }

        }
    }
   return null;
}

}