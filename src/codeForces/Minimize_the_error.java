import java.util.*;
import java.io.*;

public class Minimize_the_error {

    static FastIO scan;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("output.txt"));
        scan = new FastIO();
        int n = scan.nextInt();
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();

        long arr[] = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextLong();
        long brr[] = new long[n];
        for (int i = 0; i < n; i++)
            brr[i] = scan.nextLong();

        PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> Long.compare(y[2], x[2]));

        for (int i = 0; i < n; i++) {
            pq.add(new long[] { arr[i], brr[i], Math.abs(arr[i] - brr[i]) });
        }

        while (k1 > 0 && k2 > 0 && !pq.isEmpty()) {
            long cur[] = pq.poll();

            if (cur[2] == 0)
                break;

            if (cur[1] > cur[0]) {
                cur[1]--;
                k2--;
                if (cur[1] - cur[0] > 0) {
                    cur[0]++;
                    k1--;
                }
            } else {
                cur[1]++;
                k2--;
                if (cur[1] - cur[0] > 0) {
                    cur[0]--;
                    k1--;
                }
            }
            pq.add(new long[] { cur[0], cur[1], Math.abs(cur[0] - cur[1]) });
        }
        while (k1 > 0 && !pq.isEmpty()) {
            long cur[] = pq.poll();

            if (cur[2] == 0)
                break;

            if (cur[1] > cur[0]) {
                cur[0]++;
                k1--;
            } else {
                cur[0]--;
                k1--;
            }
            pq.add(new long[] { cur[0], cur[1], Math.abs(cur[0] - cur[1]) });
        }

        while (k2 > 0 && !pq.isEmpty()) {
            long cur[] = pq.poll();

            if (cur[2] == 0)
                break;

            if (cur[1] > cur[0]) {
                cur[1]--;
                k2--;
            } else {
                cur[1]++;
                k2--;
            }
            pq.add(new long[] { cur[0], cur[1], Math.abs(cur[0] - cur[1]) });
        }

        long ans = 0;
        while (!pq.isEmpty()) {
            ans += (pq.peek()[2] * pq.peek()[2]);
            pq.poll();
        }

        if (k1 % 2 != k2 % 2)
            ans++;
        System.out.println(ans);
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

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + arr[i];
        return prefix;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
