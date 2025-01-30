package codeForces;
import java.util.*;
public class halloumiBoxes {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			
			
			
			boolean isSorted=true;
			
			if(k==1) {
			for(int i=0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					isSorted=false;
					break;
				}
			}
			System.out.println(isSorted?"YES":"NO");
			}
			
			
			else System.out.println("YES");
			
			
			
		}
		scan.close();
		
	}
}
