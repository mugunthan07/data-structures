import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6};

        union(arr1,arr2);
     }
     static void union(int[] arr1, int[] arr2){
         HashSet<Integer> union = new HashSet<>();

         for (int i=0;i< arr1.length;i++) {
             union.add(i);
         }


         for (int i=0;i< arr2.length;i++){

             if(union.contains(i)){
                 System.out.print(arr2[i]+" ");

             }

         }



            }
        }


