import java.io.*;
import java.util.*;

public class queen {
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
        int n = scan.nextInt();
        HashMap<Integer, ArrayList<Integer>> child = new HashMap<>();

        HashSet<Integer> noRespect = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int p = scan.nextInt();
            int c = scan.nextInt();

            if(!child.containsKey(p)) child.put(p, new ArrayList<>());
            child.get(p).add(i);

            if (c == 1)
                noRespect.add(i);
        }

        TreeSet<Integer> ans = new TreeSet<>();
        for (int it : noRespect) {
            ArrayList<Integer> c = child.getOrDefault(it, new ArrayList<>());
            boolean flag = false;
            for(int i : c) {
                if(!noRespect.contains(i)) flag = true;
            }
            if (!(flag)) ans.add(it);
            
        }
        for(int it:ans) System.out.print(it+" ");
        System.out.println(ans.size() == 0 ? "-1":"");
    }
}
