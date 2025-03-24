package codeForces;
import java.util.*;
public class BuildingAnAquarium {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			long x=scan.nextLong();
			
			long arr[]=new long [n];
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			Arrays.sort(arr);
			
			long l=1;
			long r=(int)1e10;
			
			long mid;
			while(l<=r) {
				mid=l+(r-l)/2;
				if(isPosi(mid,arr,x)) {
//					ans=mid;
					r=mid-1;
				}
				else {
					l=mid+1;
				}
			}
			System.out.println(r);
		}
	}
	public static boolean isPosi(long mid,long arr[],long x) {
		long sum=0;
		for(int i=0;i<arr.length;i++) {
			if(mid>arr[i])sum+=(mid-arr[i]);
			
		}
		 return sum>x;
	}
}
