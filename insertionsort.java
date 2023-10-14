public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,9,1,4,3,7,9,2,8,22};
        sort(arr);
    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
