package codeForces;
import java.util.*;
import java.io.*;
public class AddModulo10 {
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
	 
	// GCD
	 static long gcd(long a, long b) {
		if (b == 0) return a;
	    return gcd(b, a % b);
	 }

	 // LCM
	 static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b;
	 }
	 
	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);
		 int t = scan.nextInt();
		 
		 while(t-->0) {
			 int n = scan.nextInt();
			 
			 long arr[] = new long[n];
			 
			 for(int i =0 ; i < n ; i++) {
				 arr[i] = scan.nextLong();
				 if(arr[i] % 2 != 0) arr[i] = arr[i] + (arr[i] % 10);
			 }
				 
			 boolean isZero = false , isNon = false;
			 
			 for(int i = 0 ; i < n ; i++) {
				 if(arr[i] % 10 == 0) isZero = true;
				 if(arr[i] % 10 != 0) isNon = true;
			 }
			 
			 if(isNon && isZero) {
				 System.out.println("NO");
				 continue;
			 }
			 
			 else if(!isNon && isZero) {
				 long start = arr[0];
				 boolean flag = false;
				 for(int i = 0 ; i < n ; i++) {
					 if(arr[i] != start) {
						 flag = true;
						 break;
					 }
				 }
				 System.out.println(flag ? "NO": "YES");
			 }else {
				 for(int i = 0 ; i < n ; i++) {
					 String s = String.valueOf(arr[i]);
					 if(s.charAt(s.length()-1) == '2') continue;
					 while(arr[i] % 10 != 2) {
						 arr[i] = arr[i] + (arr[i] % 10);
					 }
				 }
//				 System.out.println(Arrays.toString(arr));
				 
				 Arrays.sort(arr);
				 long max = arr[n - 1];
				 boolean flag = true;
				 for(int i = 0 ; i < n ; i++) {
					 if((max - arr[i]) % 20 != 0) {
						 flag = false;
						 break;
					 }
				 }
				 
				 System.out.println(flag ? "YES" : "NO");
			 }
		 }
	 }
}
