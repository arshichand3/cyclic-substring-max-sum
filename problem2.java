import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        
        int rem = arr[0] % k;

        for (int i = 1; i < n; i++) {
            if (arr[i] % k != rem) {
                System.out.println(-1);
                return;
            }
        }

        
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (arr[i] - rem) / k;
        }

        
        Arrays.sort(b);

        
        int median = b[n / 2];

        
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += Math.abs(b[i] - median);
        }

        System.out.println(operations);
    }
}
