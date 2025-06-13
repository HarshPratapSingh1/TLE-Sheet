package codeForces;
import java.util.*;
public class quests {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			
			int a[]=new int[n];
			int b[]=new int[n];
			PriorityQueue<Integer> bq = new PriorityQueue<>(Collections.reverseOrder());

			for(int i=0;i<n;i++)a[i]=scan.nextInt();
			for(int i=0;i<n;i++)b[i]=scan.nextInt();
						
			int max=-(int)1e9;
			int res=-(int)1e9;
			int gains=0;
			
			for(int i=1;i<=n;i++) {
				gains+=a[i-1];
				
				int rem=k-i;
				if(rem<0)break;
				max=Math.max(max, b[i-1]);
				
				int x=gains+rem*max;
				res=Math.max(res, x);
			}
			System.out.println(res);
		}
		scan.close();
	}
}
