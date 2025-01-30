package codeForces;
import java.util.*;
public class coverInWater {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			String cells=scan.next();
			
			char arr[]=cells.toCharArray();
			
			int max=Integer.MIN_VALUE;
			int cnt=0;
			int total=0;
			for(int i=0;i<n;i++) {
				if(arr[i]=='.') {
					cnt++;
					total++;
					max=Math.max(cnt, max);
				}
				
				else if(arr[i]=='#') {
					cnt=0;
				}
			}
			
			if(max>2)System.out.println(2);
			else {
				System.out.println(total);
			}
		}
		scan.close();
	}
}
