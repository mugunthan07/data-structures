public class freqelement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 1, 2, 5, 1};
        int maxcount = 0;
        int o = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxcount) {
                maxcount = count;
                o = arr[i];
            } else if
            (count == maxcount && o > arr[i]) {
                maxcount = count;
                o = arr[i];
            }
        }
            System.out.println(o);
        }

    }
