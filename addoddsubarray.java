public class addoddsubarray {
    public static void main(String[] args) {
        int arr[] = {1,5,3,1,2};

        oddsubarray(arr);
    }
    static void oddsubarray(int[] arr){
        int n = arr.length;

        int sum = 0;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j+=2){
                for (int k=i;k<=j;k++){
                    sum += arr[k];
                }
            }
        }
        System.out.println(sum);
    }
}
