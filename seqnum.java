
import java.util.HashSet;

public class seqnum {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,7,9};
        seq(arr);
    }
    static void seq(int[] arr){


        HashSet<Integer> s = new HashSet<>();

        for(int i : arr){
            s.add(i);
        }
        int num = 0;
        for(int i : arr){
            if(!s.contains(i-1)){
             int current = i;
             int currentlen = 1;
             while(s.contains(current+1)){
                    current +=1;
                    currentlen +=1;
             }
             num = Math.max(num,currentlen);

            }
        }
        System.out.print(num+ " ");

    }
}
