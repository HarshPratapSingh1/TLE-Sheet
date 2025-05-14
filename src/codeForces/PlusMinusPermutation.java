package codeForces;
import java.util.*;
public class PlusMinusPermutation {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			long n = scan.nextLong();
			long x = scan.nextLong();
			long y = scan.nextLong();
			
			long Lcm = lcm(x,y);
			
			long val1 = n / x;
			long val2 = n / y;
			long val3 = n / Lcm;
			
			long plus = val1 - val3;
			long minus = val2 - val3;

			long sumL = plus * n - (plus * (plus - 1))/2; //Ap Sum
			long sumS = (minus * (minus + 1))/2; //sum of n natural numbers
			
			System.out.println(sumL-sumS);
		}
	}
	public static long lcm(long a,long b) {
		 return a / gcd(a, b) * b;
    }

    public static long gcd(long a, long b) {
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
