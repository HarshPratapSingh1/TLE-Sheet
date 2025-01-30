package codeForces;
import java.util.*;
public class beautifulArray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			long n=scan.nextLong();
			long k=scan.nextLong();
			long b=scan.nextLong();
			long s=scan.nextLong();
			
			long act=k*b;
			long maxAct=act+(n)*(k-1);
			
			if(act>s||maxAct<s) {
				System.out.println(-1);
				continue;
			}s=s-act;
			long arr[]=new long[(int)n];
			arr[(int)n-1]=act;
			if(s>=k-1) {
				arr[(int)n-1]+=(k-1);
				s-=(k-1);
			}else {
				arr[(int)n-1]+=s;
				s=0;
			}
			
			for(int i=(int)n-2;i>=0;i--) {
				arr[i]=Math.min(k-1, s);
				s-=arr[i];
			}
			
			System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
		}
	}
	
}
