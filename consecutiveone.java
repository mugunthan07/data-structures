public class consecutiveone {
    public static void main(String[] args) {
        int[] arr = {1,5,0,1,2,1,1,1,1,1,0,2,1,1,1};
        one(arr);
    }
    static void one(int[] arr) {
        int n = arr.length;

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                count++;

            } else {
                count = 0;

            }

            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
