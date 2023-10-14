public class secondmaxelement {
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,3,2,9,0,5};
        max(arr);
    }
    static void max(int[] arr){
        int maximum = arr[0];
        int sec_max = arr[1];

        for (int i=2;i< arr.length;i++){
            if(arr[i] > maximum){
                sec_max = maximum;
                maximum = arr[i];

            }else{
                if(arr[i] > sec_max){
                    sec_max = arr[i];
                }
            }
        }
        System.out.println(sec_max);
    }
}
