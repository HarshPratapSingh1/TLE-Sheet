package codeForces;
import java.util.*;
public class MirrorGrid {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- >0) {
			int n = scan.nextInt();
			scan.nextLine();
			int arr[][] = new int[n][n];
			
			for(int i = 0 ; i < n ; i++) {
				String s = scan.nextLine();
				for(int j = 0 ; j < s.length() ; j++) {
					arr[i][j] = s.charAt(j) - '0';
				}
			}
			
			int vis[][] = new int[n][n];
			int ans = 0;
			for(int i = 0 ; i < n/2 ; i++) {
				for(int j = 0 ; n % 2 != 0?j <= n/2 : j < n /2; j++) {
//					if((vis[i][j] == 1|| vis[i + j][n-1] == 1|| vis[n-1][n-j-1] == 1|| vis[n-1-j][i] == 1)) continue;
					
					int cnt = arr[i][j] + arr[j][n - 1 - i] + arr[n - 1 - i][n - j - 1] + arr[n - 1 - j][i];
					
					vis[i][j] = vis[j][n - 1 - i] = vis[n-1 - i][n-j-1] = vis[n-1-j][i] = 1;
					
					if(cnt == 0)continue;
					
					if(cnt > 2) {
						arr[i][j] = arr[j][n - 1 - i] = arr[n-1 - i][n-j-1] = arr[n-1-i][0] = 1;
						ans += 4 - cnt;
					}else {
						arr[i][j] = arr[j][n - 1 - i] = arr[n-1 - i][n-j-1] = arr[n-1-i][0] = 0;
						ans += cnt;
					}
					
//					System.out.println(cnt+" "+ans);
//					System.out.println(i+" "+j);
//					System.out.println((j)+" "+(n-1 - i));
//					System.out.println((n-1-i)+" "+(n-j-1));
//					System.out.println((n-1-j)+" "+i);
//					
//					for(int it[]:vis)System.out.println(Arrays.toString(it));
//					System.out.println("-----------------------");
				}
			}
			System.out.println(ans);
		}
	}
}
