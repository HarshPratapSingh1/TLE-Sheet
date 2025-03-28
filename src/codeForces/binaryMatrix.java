package codeForces;
import java.util.*;
public class binaryMatrix {
	public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        scan.nextLine();  

	        while (t-- > 0) {
	            int arr[][] = new int[n][m];

	            for (int i = 0; i < n; i++) {
	                String row = scan.nextLine();
	                for (int j = 0; j < m; j++) {
	                    arr[i][j] = row.charAt(j) - '0';
	                }
	            }

	            int max = 0;

	            for (int i = 0; i < n; i++) {
	                int cnt0 = 0, cnt1 = 0;
	                for (int j = 0; j < m; j++) {
	                    if (arr[i][j] == 0) cnt0++;
	                    else cnt1++;
	                }
	                if (cnt0 > cnt1) max++;
	            }

	            System.out.println(max);
	        }
	        
	        scan.close();
	    }
}