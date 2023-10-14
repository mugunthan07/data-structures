public class minmultiint {
    public static void main(String[] args) {
        int n = 81000;
        min(n);
    }
    static void min(int n){
        String ans="";
        for (int i=9;i>=2;i--){
            while(n % i == 0){
                n = n/i;
                ans += i;
            }
        }
        if(n != 1){
            System.out.println("-1");
        }else {
            System.out.println(Integer.parseInt(ans));
        }
    }
}
