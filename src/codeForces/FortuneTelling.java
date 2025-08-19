package codeForces;
import java.util.*;
import java.io.*;
public class FortuneTelling {
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

	public static void main(String []args) {
		int t = scan.nextInt();
		while(t-->0) {
			int n = scan.nextInt();
			long AliceStart = scan.nextInt();
			long y = scan.nextLong();
			
			long arr[] = new long[n];
			
			int cnt = 0;
			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextLong();
//				if(arr[i] == 0) continue;
				if(arr[i] % 2 == 1) cnt++;
//				else cnt--;
			}
			
			
			long Ap = AliceStart % 2;
			long Bp = 1 - Ap;
			
			if(cnt % 2 == 1) {
				Ap = 1 - Ap;
				Bp = 1 - Bp;
			}

			long finalP = y % 2;

//			System.out.println(Ap+" "+finalP);
			if(Ap == finalP) {
				System.out.println("Alice");
			}else System.out.println("Bob");
			
		}
	}
}
