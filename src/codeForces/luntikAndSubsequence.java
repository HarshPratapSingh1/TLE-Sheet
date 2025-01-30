package codeForces;
import java.util.*;
public class luntikAndSubsequence {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			

				long cnt1=0;
				long cnt0=0;
				long sum=0;
				for(int i=0;i<n;i++) {
					sum+=arr[i];
					if(arr[i]==1)cnt1++;
					if(arr[i]==0)cnt0++;
				}
				long k=1;
				if(cnt0!=0)k=(long)Math.pow(2, cnt0);
				System.out.println(cnt1*k);

		}
	}
}
