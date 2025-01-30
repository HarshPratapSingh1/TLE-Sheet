package codeForces;
import java.util.*;
public class oddDivisor {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			Long n=scan.nextLong();
			 if (isPowerOfTwo(n)) {
	                System.out.println("NO");
	            } else {
	                System.out.println("YES");
	            }
	        }
	        scan.close();
		}
		static boolean isPowerOfTwo(long n) {
	        return (n & (n - 1)) == 0;
	    }
}
