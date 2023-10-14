public class palindrome {
    public static void main(String[] args) {
        int n = 12;
        int rem=0;
        int res=0;
        int temp = n;
        while(n > 0){
            rem =  n%10;
             res = (res * 10) + rem;
            n/=10;


        }
        if(temp==res){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
