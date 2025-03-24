package codeForces;
import java.util.*;
public class ForbiddenInteger {
	public static void main(String[]args){
		 Scanner scanner = new Scanner(System.in);
	        long t = scanner.nextLong();
	        while (t-- > 0) {
	            long n = scanner.nextLong();
	            long k = scanner.nextLong();
	            long x = scanner.nextLong();
	            if (x != 1) {
	                System.out.println("YES");
	                System.out.println(n);
	                for (long p = 0; p < n; p++) {
	                    System.out.print("1 ");
	                }
	                System.out.println();
	            } else if (k >= 2 && n % 2 == 0) {
	                System.out.println("YES");
	                System.out.println(n / 2);
	                for (long p = 0; p < n / 2; p++) {
	                    System.out.print("2 ");
	                }
	                System.out.println();
	            } else if (k >= 3) {
	                System.out.println("YES");
	                System.out.println(n / 2);
	                System.out.print("3 ");
	                for (long p = 1; p < n / 2; p++) {
	                    System.out.print("2 ");
	                }
	                System.out.println();
	            } else {
	                System.out.println("NO");
	            }
	        }
	        scanner.close();
	    }
	}
