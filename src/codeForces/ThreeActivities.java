package codeForces;
import java.util.*;
public class ThreeActivities {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[][]=new long [n][2];
			long brr[][]=new long [n][2];
			long crr[][]=new long [n][2];
			
			for(int i=0;i<n;i++) {
				arr[i][0]=scan.nextLong();
				arr[i][1]=i;
			}
			
			for(int i=0;i<n;i++) {
				brr[i][0]=scan.nextLong();
				brr[i][1]=i;
			}
			
			for(int i=0;i<n;i++) {
				crr[i][0]=scan.nextLong();
				crr[i][1]=i;
			}
			
			
			Arrays.sort(arr,(x,y)->Long.compare(y[0], x[0]));
			Arrays.sort(brr,(x,y)->Long.compare(y[0], x[0]));
			Arrays.sort(crr,(x,y)->Long.compare(y[0], x[0]));
			
			long ans = 0;
			
			int k=Math.min(100,n);
			
			for(int i=0;i<k;i++) {
				for(int j=0;j<k;j++) {
					for(int l=0;l<k;l++) {
						if(arr[i][1]!=brr[j][1]&&arr[i][1]!=crr[l][1]&&crr[l][1]!=brr[j][1]) {
							long sum=arr[i][0]+brr[j][0]+crr[l][0];
							ans=Math.max(ans, sum);
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}
