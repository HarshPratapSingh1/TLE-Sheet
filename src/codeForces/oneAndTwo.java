package codeForces;
import java.util.*;
public class oneAndTwo {
	 
    public static long solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += (a[i] == 2) ? 1 : 0;
        }System.out.println(sum);
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += (a[i] == 2) ? 1 : 0;
            System.out.println(total);
            if (total == sum - total) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            System.out.println(solve(scanner));
        }
        scanner.close();
    }
}
