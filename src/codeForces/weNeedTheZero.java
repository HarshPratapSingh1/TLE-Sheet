package codeForces;
import java.util.*;
public class weNeedTheZero {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			long xor=0;
			for(int i=0;i<n;i++)xor^=arr[i];
			if(xor==0)System.out.println(0);
			else if(n%2==1)System.out.println(xor);
			else System.out.println(-1);
		}
	}
}
