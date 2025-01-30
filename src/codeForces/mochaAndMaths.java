package codeForces;
import java.util.Scanner;
public class mochaAndMaths {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();	
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			
				int min=arr[0];
				
				for(int i=1;i<n;i++) {
					min=(min&arr[i]);
				}
				
				System.out.println(min);
			
		}
	}
	
}
