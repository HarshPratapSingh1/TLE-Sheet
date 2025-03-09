package codeForces;
import java.util.*;
public class differentDivisors {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int d = scan.nextInt();
            int p1 = nextPrime(d + 1);
            int p2 = nextPrime(p1 + d);
            System.out.println((long) p1 * p2);
        }
    }

    public static int nextPrime(int n) {
        while (!isPrime(n)) {
//        	System.out.println(n);
            n++;
        }
//        System.out.println(n);
        return n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i<= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}