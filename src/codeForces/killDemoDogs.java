package codeForces;
import java.util.*;
public class killDemoDogs {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int mod = (int)1e9 + 7;
        while (t-- > 0) {
            long n = scan.nextLong();

            long one = n % mod;
            long onePart2 = (n + 1) % mod;
            long onePart3 = (2 * n + 1) % mod;
            long sum1 = (((one * onePart2) % mod) * onePart3) % mod;
            sum1 = (sum1 * modInverse(6, mod)) % mod;

            long sum2 = ((n % mod) * ((n - 1) % mod)) % mod;
            sum2 = (sum2 * modInverse(2, mod)) % mod;

            long three1 = n % mod;
            long three2 = (n - 1) % mod;
            long three3 = (2 * n - 1) % mod;
            long sum3 = (((three1 * three2) % mod) * three3) % mod;
            sum3 = (sum3 * modInverse(6, mod)) % mod;

            long ans = (((sum1 * 2022) % mod + (sum2 * 2022) % mod) % mod + (sum3 * 2022) % mod) % mod;
            System.out.println(ans);
        }
    }

    static long modInverse(long a, long mod) {
        return modPow(a, mod - 2, mod);
    }

    static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}