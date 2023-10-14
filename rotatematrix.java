public class rotatematrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,4,2},{9,8,6}};
       rotate(arr);

       /*
       1 2 3
       1 4 2
       9 8 6
        */

        /*
        9 1 1
        8 4 2
        6 2 3
         */




    }
    static void rotate(int[][] arr) {



        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        int left = 0, right = arr.length - 1;
        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}




