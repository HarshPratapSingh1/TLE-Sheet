package codeForces;
import java.util.*;
public class JohnnyAndAncientComputer {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();

	        while (t-- > 0) {
	            long a = scan.nextLong();
	            long b = scan.nextLong();
	            System.out.println(minOperations(a, b));
	        }

	        scan.close();
	    }

	    public static int minOperations(long a, long b) {
	        if (a > b) {
	            long temp = a;
	            a = b;
	            b = temp;
	        }

	        long baseA = a, baseB = b;
	        while (baseA % 2 == 0) baseA /= 2;
	        while (baseB % 2 == 0) baseB /= 2;
	        if (baseA != baseB) return -1;

	        int cntA = 0, cntB = 0;
	        while (a % 2 == 0) {
	            a /= 2;
	            cntA++;
	        }
	        while (b % 2 == 0) {
	            b /= 2;
	            cntB++;
	        }

	        int diff = Math.abs(cntA - cntB);
	        int steps = 0;
	        steps += diff / 3;
	        diff %= 3;
	        steps += diff / 2;
	        diff %= 2;
	        steps += diff;

	        return steps;
	    }
	}