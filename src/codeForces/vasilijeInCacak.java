package codeForces;
import java.util.*;
public class vasilijeInCacak {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			long n,k,x;
			 n=scan.nextLong();
			 k=scan.nextLong();
			 x=scan.nextLong();
			

			 if (2 * x >= k * (k + 1) && 2 * x <= n * (n + 1) - (n - k) * (n - k + 1)) {
				 System.out.println("YES");
			 }
			else {
				System.out.println("No");
			}
		}scan.close();
	}
}
