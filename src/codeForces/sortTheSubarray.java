package codeForces;
import java.util.*;
public class sortTheSubarray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			int brr[]=new int [n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			for(int i=0;i<n;i++)brr[i]=scan.nextInt();

			
			boolean flag=true;
			for(int i=0;i<n;i++) {
				if(arr[i]!=brr[i]) {
					flag=false;
					break;
				}
			}
			
			if(flag)System.out.println(1+" "+n);
			else{
				int i=0;
				int idx1=0;
				while(i<n) {
					if(arr[i]!=brr[i]) {
						idx1=i;
						break;
					}
					i++;
				}
				i=n-1;
				int idx2=0;
				while(i>=0) {
					if(arr[i]!=brr[i]) {
						idx2=i;
						break;
					}
					i--;
				}
//				System.out.println((idx1)+" "+(idx2));

				for(i=idx1;i>0;i--) {
					if(brr[i]>=brr[i-1]) {
						
						if(idx1-1==i-1)idx1--;
					}
				}
				for(i=idx2;i<n-1;i++) {
					if(brr[i]<=brr[i+1]) {
//						System.out.println(brr[i]+" "+i+" "+brr[i+1]+" "+(i+1));
						if(idx2+1==i+1)idx2++;
					}
//					System.out.println(i);
				}
				
				System.out.println((idx1+1)+" "+(idx2+1));
			}
		}
	}
}
