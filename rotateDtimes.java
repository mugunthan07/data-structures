public class rotateDtimes {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int d=3;
        int n= arr.length;
        rotate(arr,d,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void rotate(int[] arr,int d,int n){
        if(n==0) return;;

        d = d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);


    }
    static void reverse(int[] arr, int low, int high) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
}
