import java.util.*;
import java.io.*;

public class LostNumbers {

    static FastIO scan = new FastIO();

    public static void main(String[] args) {
        int arr[] = {4,8,15,16,23,42};

        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++) map.put(arr[i]*arr[j], new int[]{arr[i],arr[j]});
        }
        
        int res[] = new int[6];

        int mul1 = query(0, 1);
        int mul2 = query(1, 2);
        int common = common(map.get(mul1), map.get(mul2));
        res[1] = common;
        int other1 = other(map.get(mul1), res[1]);
        int other2 = other(map.get(mul2), res[1]);
        res[0] = other1;
        res[2] = other2;

        mul1 = query(3, 4);
        mul2 = query(4, 5);
        common = common(map.get(mul1), map.get(mul2));
        res[4] = common;
        other1 = other(map.get(mul1), common);
        other2 = other(map.get(mul2), common);
        res[3] = other1;
        res[5] = other2;

        System.out.print("! ");
        for(int it:res)System.out.print(it+" ");
    }
    public static int query(int i, int j){
        System.out.println("? "+(i+1)+" "+(j+1));
        int ans = scan.nextInt();
        return ans;
    }
    public static int common(int[]a, int[]b){
        if(a[0] == b[0] || a[0] == b[1]) return a[0];
        return a[1];
    }
    public static int other(int[]a ,int val){
        if(a[0] == val) return a[1];
        return a[0];
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

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        void print(String s) { System.out.print(s); }
        void println(String s) { System.out.println(s); }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    static long gcd(long a, long b) { return (b == 0) ? a : gcd(b, a % b); }
    static long lcm(long a, long b) { return (a / gcd(a, b)) * b; }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

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
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}