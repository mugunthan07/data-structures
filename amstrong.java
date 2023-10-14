class amstrong {
    public static void main(String[] args) {
        int n = 4;
        int k=n;

        int rem, res = 0;
        while(k != 0){
            rem = n%10;
            res += Math.pow(rem,3);
            k/=10;
        }
        if(res == n){
            System.out.println(n + " is an amstrong");
        }else{
            System.out.println(n+" is not an armstrong");
        }
    }
}