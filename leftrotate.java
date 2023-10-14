class leftrotate{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
    }
    static void rotate(int[] arr){
        int[] temp = new int[arr.length];
        for (int i=1;i< arr.length;i++){
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        for (int i=0; i< temp.length;i++){
            System.out.print(temp[i]+ " ");
        }
    }
}