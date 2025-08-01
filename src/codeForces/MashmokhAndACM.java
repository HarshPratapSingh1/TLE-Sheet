package codeForces;

import java.io.*;
import java.util.*;

public class MashmokhAndACM {

    // Fast Input and Output
    static class FastIO {
        BufferedReader br;
        StringTokenizer st;

        public FastIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void print(String s) {
            System.out.print(s);
        }

        void println(String s) {
            System.out.println(s);
        }
    }

    // Debug Function
    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    // GCD
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // LCM
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    // Prime Check
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Sieve of Eratosthenes
    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // Modular Exponentiation
    static long modExp(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    // Factorial Modulo
    static long factorialMod(int n, int mod) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % mod;
        }
        return result;
    }

    // Prefix Sum
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    // Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Not found
    }

    static int MOD = (int)1e9+7;
	public static void main(String[]args) {
		FastIO scan = new FastIO();
		int n = scan.nextInt();
		int k = scan.nextInt();		
		
		int dp[][] = new int[n+1][k+1];
		for(int it[]:dp)Arrays.fill(it, -1);
		
		int ans = 0;
		for(int i = 1 ; i <= n ; i++) {
			ans = (ans + solve(n, i, k , 1 , dp))%MOD;
		}
		
		System.out.println(ans);
	}
	public static int solve(int n , int idx , int k , int len ,int dp[][]) {
		if(len  == k) return 1;
		if(dp[idx][len] != -1) return dp[idx][len];
		
		long res = 0;
		for(int i = idx ; i <= n ; i += idx) {
			res = (res + solve(n, i, k, len + 1, dp)) % MOD;
		}
		return dp[idx][len] = (int)res;
	}
}
