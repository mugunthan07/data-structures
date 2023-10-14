public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,6};
        int t = 6;
        search(arr,t);
    }
    static void search(int[] arr, int t){
        int n = arr.length;
        int i=0;
        for (i=0;i<n;i++){
            if(arr[i] == t){
                System.out.println(i);
            }
        }
    }
}
