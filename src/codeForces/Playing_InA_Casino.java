package codeForces;
import java.util.*;
public class Playing_InA_Casino {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
	
		while(t-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			int arr[][] = new int[n][m];
			
			for(int i = 0 ; i < n ; i++) for(int j = 0 ; j < m ; j++) arr[i][j] = scan.nextInt();
			
			
			long ans = 0;
			for (int j = 0; j < m; j++) {
                int[] col = new int[n];
                
                for (int i = 0; i < n; i++) {
                    col[i] = arr[i][j];
                }
                
                Arrays.sort(col);
                
                int k = n - 1;
                for (int i = 0; i < n; i++) {
                    ans -= (long)k * col[i];
                    ans += (long)(n - 1 - k) * col[i];
                    k--;
                }
            }
            
            System.out.println(ans);
        }
    }
}