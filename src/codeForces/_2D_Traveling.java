package codeForces;
import java.util.*;
import java.io.*;

public class _2D_Traveling {
	public static void main(String[]args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Long[][] arr = new Long[n][2];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Long.parseLong(st.nextToken());
                arr[i][1] = Long.parseLong(st.nextToken());
            }
			long val=Math.abs(arr[a-1][0]-arr[b-1][0])+Math.abs(arr[a-1][1]-arr[b-1][1]);
			
			if(k==0) {
				System.out.println(val);
				continue;
			}
			long m1=Long.MAX_VALUE;
			long m2=Long.MAX_VALUE;
			
			for(int i=0;i<k;i++) {
				if(Math.abs(arr[a-1][0]-arr[i][0])+Math.abs(arr[a-1][1]-arr[i][1])<m1)m1=Math.abs(arr[a-1][0]-arr[i][0])+Math.abs(arr[a-1][1]-arr[i][1]);
				if(Math.abs(arr[b-1][0]-arr[i][0])+Math.abs(arr[b-1][1]-arr[i][1])<m2)m2=Math.abs(arr[b-1][0]-arr[i][0])+Math.abs(arr[b-1][1]-arr[i][1]);
			}
			
			System.out.println(Math.min(m1+m2, val));
		}
	}
}