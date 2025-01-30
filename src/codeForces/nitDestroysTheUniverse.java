package codeForces;
import java.util.*;
public class nitDestroysTheUniverse {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			boolean isZero=true;
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					isZero=false;
					break;
				}
			}
			if(isZero) {
				System.out.println(0);
				continue;
			}
			
			
			int cnt=0;
			boolean isSegment=false;
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					if(!isSegment) {
						cnt++;
						isSegment=true;
					}
				}else {
					isSegment=false;
				}
			}
			System.out.println(Math.min(cnt, 2));
		}
	}
}
