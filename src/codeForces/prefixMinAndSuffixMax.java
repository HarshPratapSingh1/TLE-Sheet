package codeForces;
import java.util.Scanner;

public class prefixMinAndSuffixMax {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			
			int k[] = new int[n];
			for(int i = 0 ; i < n ; i++) k[i] = scan.nextInt();
			
			int maxId = -1,minId = -1;
			int val1 = Integer.MIN_VALUE,val2 = Integer.MAX_VALUE;
			for(int i = 0 ; i < n ; i++) {
				if(val1 < k[i]) {
					maxId = i;
					val1 = k[i];
				}
				if(val2 > k[i]) {
					minId = i;
					val2 = k[i];
				}
			}

			StringBuilder st = new StringBuilder();
			for(int i = 0 ; i < n ; i++) st.append(0);
			
			int tillMax = k[n - 1],tillMin = k[0];
			
			for(int i = 0 ; i <= minId ; i++) {
				if(k[i] <= tillMin) {
					st.setCharAt(i, '1');
					tillMin = k[i];
				}
				else continue;
			}
			
			for(int j = n - 2; j >= maxId ; j--) {
				if(k[j] >= tillMax) {
					st.setCharAt(j, '1');
					tillMax = k[j];
				}
				else continue;
			}
			
			st.setCharAt(minId, '1');
			st.setCharAt(maxId, '1');
			st.setCharAt(0, '1');
			st.setCharAt(n - 1, '1');
			System.out.println(st.toString());
		}
	}
}
