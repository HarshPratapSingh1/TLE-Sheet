
// package codeForces;
import java.util.*;
import java.io.*;

public class BerlandRegional {
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

    static FastIO scan = new FastIO();

    public static void main(String[] args) {
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long u[] = new long[n];
            long s[] = new long[n];

            for (int i = 0; i < n; i++)
                u[i] = scan.nextLong();
            for (int i = 0; i < n; i++)
                s[i] = scan.nextLong();

            PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> Long.compare(y[1], x[1]));

            for (int i = 0; i < n; i++)
                pq.add(new long[] { u[i], s[i] });

            HashMap<Long, ArrayList<Long>> map = new HashMap<>();

            while (!pq.isEmpty()) {
                long[] cur = pq.poll();
                if (!map.containsKey(cur[0]))
                    map.put(cur[0], new ArrayList<Long>());
                ArrayList<Long> l = map.get(cur[0]);
                if (l.size() > 0)
                    l.add(l.get(l.size() - 1) + cur[1]);
                else
                    l.add(cur[1]);
                map.put(cur[0], l);
            }

            long sum[] = new long[n];

            for (Map.Entry<Long, ArrayList<Long>> m : map.entrySet()) {
                ArrayList<Long> l = m.getValue();
                for (int i = 1; i <= Math.min(l.size(), n); i++) {
                    int val = l.size() % i;
                    sum[i - 1] += l.get(l.size() - val - 1);
                }
            }
            // System.out.println("output->");
            for (long it : sum)
                System.out.print(it + " ");
            System.out.println();
        }
    }
}
