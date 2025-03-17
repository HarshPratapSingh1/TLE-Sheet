package codeForces;
import java.util.*;
public class dejaVu {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int q=scan.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			int x[]=new int[q];
			for(int i=0;i<q;i++)x[i]=scan.nextInt();
			HashSet<Integer>set=new HashSet<>();
			for(int i=0;i<q;i++) {
				if(set.contains(x[i]))continue;	
				set.add(x[i]);
				for(int j=0;j<n;j++) {
					if(arr[j]%(1<<x[i])==0)arr[j]+=(1<<(x[i]-1));
				}
			}
			for(long it:arr)System.out.print(it+" ");
			System.out.println();
		}
	}
}
