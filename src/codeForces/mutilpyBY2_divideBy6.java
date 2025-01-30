package codeForces;	
import java.util.Scanner;

public class mutilpyBY2_divideBy6 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int cnt2=0;
			int cnt3=0;
			
			while(n%2==0) {
				
					n/=2;
					cnt2++;
				}
			while(n%3==0) {
					n/=3;
					cnt3++;
				}
				
			
			if(n==1&&cnt2<=cnt3)System.out.println((cnt3-cnt2)+cnt3);
			else {
				System.out.println(-1);
			}
		}
		
	}
}
