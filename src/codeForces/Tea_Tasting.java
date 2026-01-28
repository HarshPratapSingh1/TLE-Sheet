import java.util.*;
import java.io.*;

public class Tea_Tasting {

    static FastIO scan;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("output.txt"));

        scan = new FastIO();
        int t = scan.nextInt();
        while (t-- > 0) {
            // TODO: Solve each test case here
            int n = scan.nextInt();
            long arr[] = new long[n];
            long brr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = scan.nextLong();
            for (int i = 0; i < n; i++)
                brr[i] = scan.nextLong();

            long prefix[] = prefixSum(brr);
            long freq[] = new long[n];
            long ans[] = new long[n];
            for (int i = 0; i < n; i++) {
                long val = arr[i];
                int idx = binarySearch(prefix, val, i + 1, prefix[i]);
                if (idx == -1) {
                    ans[i] += arr[i];
                } else if (idx == n) {
                    freq[i]++;
                } else {
                    freq[i]++;
                    freq[idx]--;
                    ans[idx] += (arr[i] - prefix[idx] + prefix[i]);
                }
            }
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += freq[i];
                if (cnt > 0)
                    ans[i] += (cnt * brr[i]);
            }
            for (long it : ans)
                System.out.print(it + " ");
            System.out.println();
        }
    }

    static long[] prefixSum(long[] arr) {
        int n = arr.length;
        long[] prefix = new long[n + 1];
        prefix[0] = 0;
        for (int i = 1; i <= n; i++)
            prefix[i] = prefix[i - 1] + arr[i - 1];
        return prefix;
    }

    static int binarySearch(long[] arr, long target, int l, long minus) {
        int left = l, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - minus <= target) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;
    }

    // ---------------------- UTILITY METHODS BELOW ----------------------

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

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++)
            if (isPrime[i])
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
        return isPrime;
    }

    static long modExp(long base, long exp, long mod) {
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

    static long factorialMod(int n, int mod) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result = (result * i) % mod;
        return result;
    }

}
