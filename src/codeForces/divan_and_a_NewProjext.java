package codeForces;
import java.util.*;
public class divan_and_a_NewProjext {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			 int n = scan.nextInt();
	            int arr[][] = new int[n + 1][2];

	            for (int i = 1; i <= n; i++) {
	                arr[i][0] = scan.nextInt();
	                arr[i][1] = i;
	            }

	            Arrays.sort(arr, 1, n + 1, (x, y) -> Integer.compare(y[0], x[0]));

	            long total = 0;
	            long cur = 1;
	            long positions[] = new long[n + 1];

	            for (int i = 1; i <= n; i++) {
	                total += 2 * cur * arr[i][0];
	                if (i % 2 == 1) {
	                    positions[arr[i][1]] = cur;
	                } else {
	                    positions[arr[i][1]] = -cur;
	                    cur++;
	                }
	            }

	            System.out.println(total);
	            for (int i = 0; i <= n; i++) {
	                System.out.print(positions[i] + " ");
	            }
	            System.out.println();
	        }
	}
}
