public class spiralmatrix {

    public static void main(String[] args) {
            int[][] arr = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                        };

            /*
            1,2,3,4,7,5,5,3,1,9,7,3,4,6,4,9
             */




            int row = 4;
            int col = 4;
            spiral(arr,row,col);
    }
    static void spiral(int[][] arr,int row,int col){
        int left =0, top = 0, bottom = row-1, right = col-1;



        //left to right

        while (top<=bottom && left<=right){
            for (int i = left;i<=right;i++)
                System.out.print(arr[top][i]+" ");
            top++;


            //top to bottom

            for(int i=top;i<=bottom;i++)
                System.out.print(arr[i][right]+" ");
            right--;

            //right to left


            if(top<=bottom) {

                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i]+" ");
                 bottom--;
            }
            //bottom to top

            if(left<=right){
                for (int i=bottom;i>= top; i--)
                    System.out.print(arr[i][left]+" ");
                    left++;

            }


            }
        }
    }

