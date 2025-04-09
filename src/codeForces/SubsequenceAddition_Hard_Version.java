package codeForces;
import java.util.*;	
public class SubsequenceAddition_Hard_Version {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			Arrays.sort(arr);
						
			boolean flag=true;
			long sum=1;
			if(arr[0]!=1) {
				System.out.println("NO");
				continue;
			}
			for(int i=1;i<n;i++) {
				if(arr[i]>sum) {
					flag=false;
					break;
				}
				sum+=arr[i];
			}
			
			System.out.println(flag?"YES":"NO");
		}
	}
}
