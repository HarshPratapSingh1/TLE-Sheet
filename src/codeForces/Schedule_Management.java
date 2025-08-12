package codeForces;
import java.util.*;
import java.io.*;

public class Schedule_Management {
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
    static FastIO scan = new FastIO();
    
    
    public static void main(String[]args) {
    	int t = scan.nextInt();
    	
    	while(t-->0) {
    		int n = scan.nextInt();
    		int m = scan.nextInt();
    		
    		int arr[] = new int[n];
    		for(int i = 0 ; i < m ; i++) {
    			int val = scan.nextInt();
    			arr[val-1]++;
    		}
    		
    		int l = 0;
    		int r = 2 * m;
    		while(l < r) {
    			int mid = l + (r - l)/2;
    			if(isPosi(n,m,mid,arr)) {
    				r = mid;
    			}else l = mid + 1;
    		}	
    		System.out.println(l);
    	}
    }
    public static boolean isPosi(int n,int m,int mid , int arr[]) {
    	long val = 0;
    	
    	for(int i = 0 ; i < arr.length ; i++) {
    		if(mid < arr[i]) {
    			val += mid;
    		}else {
    			val += arr[i] + (mid - arr[i]) / 2;
    		}
    	}
    	return val >= m;
    }
}
