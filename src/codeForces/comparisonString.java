package codeForces;
import java.util.*;
public class comparisonString {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			String s=scan.next();
			
			char arr[]=s.toCharArray();
			
			
			
			int cnt1=1;
			int cur=1;
			
			for(int i=1;i<n;i++) {
				if(arr[i]==arr[i-1])cur++;
				else cur=1;
				
				cnt1=(cnt1>cur)?cnt1:cur;
			}
			System.out.println(1+cnt1);
		}scan.close();
	}
}
