package codeForces;
import java.util.*;
public class AssemblyViaMinimums {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while(t-- > 0) {
        	int n = scan.nextInt();
            int m = n * (n - 1) / 2;
            int[] b = new int[m];

            for (int i = 0; i < m; i++) {
                b[i] = scan.nextInt();
            }

            Arrays.sort(b);

            for (int i = 0; i < m; i += --n) {
                System.out.print(b[i] + " ");
            }

            System.out.println(1000000000);
        }

        scan.close();
	}
}
