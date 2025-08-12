package codeForces;

import java.io.*;
import java.util.*;

public class weirdSum {
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
	   int n = scan.nextInt();
	   int m = scan.nextInt();
		   
	   int arr[][] = new int[n][m];
	   for(int i = 0 ; i < n ; i++) 
		   for(int j = 0 ; j < m ; j++) arr[i][j] = scan.nextInt();
		   
	   
	   HashMap<Integer,ArrayList<Integer>> rowMap = new HashMap<>();
	   HashMap<Integer,ArrayList<Integer>> colMap = new HashMap<>();

	   for(int i = 0 ; i < n ; i++) {
		   for(int j = 0 ; j < m ; j++) {
			   if(!rowMap.containsKey(arr[i][j]))rowMap.put(arr[i][j], new ArrayList<>());
			   if(!colMap.containsKey(arr[i][j]))colMap.put(arr[i][j], new ArrayList<>());
			   colMap.get(arr[i][j]).add(j);
			   rowMap.get(arr[i][j]).add(i);
		   }
	   }
	   long finalAns = 0;
	   for(Map.Entry<Integer, ArrayList<Integer>>mp : rowMap.entrySet()) {
		   ArrayList<Integer> row = mp.getValue();
		   ArrayList<Integer> col = colMap.get(mp.getKey());
		   
		   
		   finalAns += sumOfAbsDiffs(col);
		   finalAns += sumOfAbsDiffs(row);
		   
	   }
	   
	   System.out.println(finalAns);
   }
   public static long sumOfAbsDiffs(ArrayList<Integer> arr) {
       Collections.sort(arr);
       long prefixSum = 0, total = 0;
       for (int i = 0; i < arr.size(); i++) {
           total += (long) arr.get(i) * i - prefixSum;
           prefixSum += arr.get(i);
       }
       return total;
   }
}

