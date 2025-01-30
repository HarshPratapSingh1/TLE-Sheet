package codeForces;
import java.util.*;
public class notDividing {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long n=scan.nextLong();
			long arr[]=new long[(int)n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			
			
			for(int i=0;i<n;i++) {
				if(arr[i]==1)arr[i]=2;
				
				if(i>0&&arr[i]%arr[i-1]==0) {
					
					arr[i]++;
				}
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
