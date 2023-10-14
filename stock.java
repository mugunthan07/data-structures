public class stock {
    public static void main(String[] args) {
        int[] arr = {1,7,11};
        stocksell(arr);
    }
    static void stocksell(int[] arr){


        int max=0;
        for(int i=0;i<arr.length;i++){
             for(int j = i+1;j<arr.length;j++){

                 if(arr[j] > arr[i]){
                     max = Math.max(arr[j] - arr[i],max);
                 }

             }

        }
        System.out.print(max);


    }

}
