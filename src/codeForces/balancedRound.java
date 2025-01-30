package codeForces;
import java.util.*;
public class balancedRound {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) arr[i]=scan.nextInt();
			
			Arrays.sort(arr);
			 int cnt = 1, ans = 1;
			    for(int i = 1; i < n; ++i) {
			        if(arr[i] - arr[i - 1] > k) {
			            cnt = 1;
			        } else {
			            cnt++;
			        }
			       ans=Math.max(ans, cnt);
			     }
            System.out.println(n - ans);
		}scan.close();
	}
}
