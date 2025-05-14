package codeForces;

import java.util.*;

public class PaintTheArray {
	public static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			 int n = scan.nextInt();
	            long[] a = new long[n];
	            for (int i = 0; i < n; i++) {
	                a[i] = scan.nextLong();
	            }

	            long d1 = a[0];
	            for (int i = 2; i < n; i += 2) {
	                d1 = gcd(d1, a[i]);
	            }

	            long d2 = a[1];
	            for (int i = 3; i < n; i += 2) {
	                d2 = gcd(d2, a[i]);
	            }

	            boolean valid1 = true;
	            for (int i = 1; i < n; i += 2) {
	                if (a[i] % d1 == 0) {
	                    valid1 = false;
	                    break;
	                }
	            }

	            boolean valid2 = true;
	            for (int i = 0; i < n; i += 2) {
	                if (a[i] % d2 == 0) {
	                    valid2 = false;
	                    break;
	                }
	            }

	            if (valid1) System.out.println(d1);
	            else if (valid2) System.out.println(d2);
	            else System.out.println(0);
	        }

	        scan.close();
	    }
}
	