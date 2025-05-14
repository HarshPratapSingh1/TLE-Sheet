package codeForces;
import java.util.*;
public class AndSorting {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			ArrayList<Integer>l=new ArrayList<>();
			for(int i=0;i<n;i++) {
				if(arr[i]!=i) {
					l.add(i);
//					 break;
				}
			}
			int ans=l.get(0);
			for(int i=1;i<l.size();i++)ans&=l.get(i);
			
			System.out.println(ans);
		}
	}
}
