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
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
				sum+=arr[i];
				sqrSum+=(arr[i]*arr[i]);
			}
			
			long l=1;
			long r=(int)1e32;
			long mid;
			long ans=-1;
			while(l<=r) {
				mid=l+(r-l)/2;
				if(isPosi(mid,sum,sqrSum,n,c)) {
					ans=mid;
					l=mid+1;
				}else r=mid-1;
			}
			
			System.out.println(ans);
		}
	}
	public static boolean isPosi(long x,long sum,long sqrSum ,int n,long c) {
		return n*(x*x)+2*x*(sum)+sqrSum<c;
	}
}
