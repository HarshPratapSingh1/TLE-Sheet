package codeForces;
import java.util.*;
public class CardboardForPictures {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long c=scan.nextLong();
			int arr[]=new int[n];
			
			long sum=0;
			long sqrSum=0;
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			
			long l=1;
			long r=(long)1e9;
			long mid;
			long ans=-1;
			while(l<=r) {
				mid=l+(r-l)/2;
				long val=isPosi(mid,n,c,arr);
				if(val==1) {
					ans=mid;
					break;
				}
				else if(val==0) l=mid+1;
				else r=mid-1;
			}
			
			System.out.println(ans);
		}
	}
	public static long isPosi(long x,int n,long c,int arr[]) {
		long sum=0;
		for(int i=0;i<n;i++) {
			long a=(arr[i]+x+x);
			sum+=(a*a);
			if(sum>1e18)return Long.MAX_VALUE;
		}
		return sum==c?1:sum>c?-1:0;
	}
}
