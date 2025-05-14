package codeForces;
import java.util.*;
import java.io.*;
public class liHuaAndPattern {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        int t = Integer.parseInt(br.readLine());

	        while (t-- > 0) {
	            st = new StringTokenizer(br.readLine());
	            int n = Integer.parseInt(st.nextToken());
	            long k = Long.parseLong(st.nextToken());

	            int[][] arr = new int[n][n];

	            for (int i = 0; i < n; i++) {
	                st = new StringTokenizer(br.readLine());
	                for (int j = 0; j < n; j++)arr[i][j] = Integer.parseInt(st.nextToken());
	                
	            }

			
			long cnt=0;
			
			for(int i=0;i<=n/2;i++) {
				for(int j=0;j<n;j++) {
					if((n % 2 == 0 && i == n / 2) || ( i == n / 2 && j >= n / 2))continue;

					if(arr[i][j] != arr[n-i-1][n-j-1]) cnt++;
				}
			}
			if(cnt > k)System.out.println("No");
			else {
				k -= cnt;
				
				if(n % 2 == 1)System.out.println("YES");
				else System.out.println(k % 2 == 1?"NO":"YES");
			}
		}
	}
}
