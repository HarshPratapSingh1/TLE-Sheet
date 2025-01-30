package codeForces;
import java.util.*;
public class victoryGoal {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0) {
			int n=scan.nextInt();
			int arr[]=new int[n-1];
			
			int sum=0;
			
			for(int i=0;i<n-1;i++) {
			arr[i]=scan.nextInt();
			sum+=arr[i];
			}
			
			System.out.println(-sum);
		}
		scan.close();
	}
}
