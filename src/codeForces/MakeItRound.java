package codeForces;

import java.io.*;
import java.util.*;

public class MakeItRound {
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

    public static void main(String[]args) {
    	FastIO scan = new FastIO();
    	int t = scan.nextInt();
    	
    	while(t-->0) {
    		long n = scan.nextLong();
    		long m = scan.nextLong();
    		
    		long twoCnt = 0 , fiveCnt = 0 , temp = n;
    		
    		while(n % 2 == 0) {
    			twoCnt++;
    			n /= 2;
    		}
    		
    		while(n % 5 == 0) {
    			fiveCnt++;
    			n /= 5;
    		}
    		
    		long k = 1;
    		if(twoCnt > fiveCnt) {
    			for(long i = 1 ; i <= twoCnt - fiveCnt && 5 * k <= m ; i++) {
    				k *= 5;
    			}
    		}else {
    			for(long i = 1 ; i <= fiveCnt - twoCnt && 2 * k <= m ; i++) {
    				k *= 2;
    			}
    		}
    		
    		
    		while(k * 10 <= m) k *= 10;
    		
    		System.out.println((m/k) * k * temp);
    	}
    }
}
