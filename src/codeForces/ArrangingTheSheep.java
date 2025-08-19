package codeForces;

import java.io.*;
import java.util.*;

public class ArrangingTheSheep {
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
    public static void main(String[]args) {
    	int t = scan.nextInt();
    	
    	while(t-->0) {
    		int n = scan.nextInt();
    		String s = scan.next();
    		
    		ArrayList<Integer> l = new ArrayList<>();
    		
    		for(int i = 0 ; i < n ; i++) {
    			if(s.charAt(i) == '*') l.add(i);
    		}
    		
    		int idx = (l.size() - 1) / 2;
    	
    		long ans = 0;
    		
    		for(int i = 0 ; i < l.size() ; i++) {
    			ans += Math.abs(l.get(i)-(l.get(idx)-idx+i));
    		}
    		
    		System.out.println(ans);
    	}
    }
}
