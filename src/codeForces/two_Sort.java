package codeForces;
import java.util.*;
import java.io.*;
public class two_Sort {

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

   public static void main(String[]args){
	   int t = scan.nextInt();
	   
	   while(t-->0) {
		   int n = scan.nextInt();
		   int k = scan.nextInt();
		   
		   long arr[] = new long[n];
		   for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
		   
		   long cnt = 0;
		   long elementCnt = 1;
		   
		   for(int i = 1 ; i < n ; i++) {
			   if(arr[i] * 2 > arr[i - 1]) {
				   if(elementCnt == 0) elementCnt++;
				   elementCnt++;
			   }
			   else {
				   if(elementCnt > k) {
					   cnt += (elementCnt - k);
				   }
				   elementCnt = 0;
			   }
//			   System.out.println(elementCnt);
		   }
//		   System.out.println(elementCnt);
		   if(elementCnt > 0) {
//			   if(elementCnt != n)elementCnt++;
			   if(elementCnt > k)cnt += (elementCnt - k);
		   }
		   System.out.println(cnt);
	   }
   }
}
