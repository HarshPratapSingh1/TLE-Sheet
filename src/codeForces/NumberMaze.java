import java.util.*;
import java.io.*;

public class NumberMaze {
    static FastIO scan;
    static final int MOD = 1_000_000_007;
    static final long LINF = (long) 1e18;
    static HashMap<Integer, ArrayList<String>> map;
    static ArrayList<String> l1, l2, l3;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("output.txt"));
        scan = new FastIO();
        int t = 1;
        t = scan.nextInt();
        map = new HashMap<>();
        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        l3 = new ArrayList<>();
        getPerm();

        while (t-- > 0) {
            solve();
        }
        scan.close();
    }

    static void solve() throws IOException {
        int s = scan.nextInt();
        int j = scan.nextInt()-1;
        int k = scan.nextInt()-1;

        ArrayList<String> l = map.get(s);

        String s1 = l.get(j);
        String s2 = l.get(k);

        int cntA = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                cntA++;
            }
        }
        String ans = cntA+"A"+(s1.length() - cntA)+"B";
        System.out.println(ans);
    }

    public static void getPerm() {
        perm(0, new StringBuilder("12"), l1);
        Collections.sort(l1);
        map.put(12, l1);

        perm(0, new StringBuilder("123"), l2);
        Collections.sort(l2);
        map.put(123, l2);

        perm(0, new StringBuilder("1234"), l3);
        Collections.sort(l3);
        map.put(1234, l3);
    }

    public static void perm(int idx, StringBuilder sb, ArrayList<String> l) {
        if (idx == sb.length()) {
            l.add(new String(sb.toString()));
            return;
        }

        for (int i = idx; i < sb.length(); i++) {
            swap(i, idx, sb);
            perm(idx + 1, sb, l);
            swap(i, idx, sb);
        }
    }

    public static void swap(int i, int j, StringBuilder sb) {
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }

    // ---------------------- FAST I/O ----------------------
    static class FastIO {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final PrintWriter out = new PrintWriter(System.out);

        private int readByte() throws IOException {
            if (ptr >= len) {
                ptr = 0;
                len = in.read(buffer);
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        public String next() throws IOException {
            int c = readByte();
            while (c >= 0 && c <= 32)
                c = readByte();
            if (c == -1)
                return null;
            StringBuilder sb = new StringBuilder();
            while (c > 32) {
                sb.append((char) c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() throws IOException {
            int c = readByte();
            while (c >= 0 && c <= 32)
                c = readByte();
            if (c == -1)
                return 0;
            int s = 1;
            if (c == '-') {
                s = -1;
                c = readByte();
            }
            int v = 0;
            while (c > 32) {
                v = v * 10 + (c - '0');
                c = readByte();
            }
            return v * s;
        }

        public long nextLong() throws IOException {
            int c = readByte();
            while (c >= 0 && c <= 32)
                c = readByte();
            if (c == -1)
                return 0;
            int s = 1;
            if (c == '-') {
                s = -1;
                c = readByte();
            }
            long v = 0;
            while (c > 32) {
                v = v * 10 + (c - '0');
                c = readByte();
            }
            return v * s;
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public void pn(Object o) {
            out.println(o);
        }

        public void p(Object o) {
            out.print(o);
        }

        public void close() {
            out.close();
        }
    }
}