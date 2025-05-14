package codeForces;
import java.util.*;
public class EatingCandies {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int i = 0, j = n - 1;
			
			long frontSum = 0 ,backSum = 0 ,max = 0;
			while(i<=j) {
				if(frontSum>backSum)backSum+=arr[j--];
				else frontSum+=arr[i++];
				
				if(frontSum==backSum){
					max=i+(n-1-j);
				}
			}
			System.out.println(max);

			
		}
	}
}
