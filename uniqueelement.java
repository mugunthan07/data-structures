public class uniqueelement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,5,4,6,5,4,2};

        unique(arr);
    }
    static void  unique(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }

                }
            if(count == 1)
                System.out.println(arr[i]);
        }
    }
}
