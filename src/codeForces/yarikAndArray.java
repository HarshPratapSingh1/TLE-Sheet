package codeForces;
import java.util.*;
public class yarikAndArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int sum = arr[0], max = arr[0];

            for (int i = 1; i < n; i++) {
                if ((arr[i]+arr[i - 1]) % 2==0) sum = arr[i];
                else sum = Math.max(arr[i], sum + arr[i]);
                
                max = Math.max(sum, max);
            }

            System.out.println(max);
        }
        sc.close();
    }
}