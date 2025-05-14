package codeForces;
import java.util.*;	
public class GCD_Partition {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			long sum=0;
			for(int i=0;i<n;i++)sum+=arr[i];
//			System.out.println(sum);
			long sum1=0;
			long ans=1;
			for(int i=0;i<n-1;i++) {
				sum1+=arr[i];
				sum-=arr[i];
				long val=gcd(sum,sum1);
				ans=Math.max(ans,val);
//				System.out.println(val);
			}
			System.out.println(ans);
		}
	}
	public static long gcd(long a , long b) {
		while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
}
