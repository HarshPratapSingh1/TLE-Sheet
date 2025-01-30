package codeForces;
import java.util.*;
public class _01Game {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			String s=scan.next();
			int cnt0=0;
			int cnt1=0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1')cnt1++;
				if(s.charAt(i)=='0')cnt0++;
			}
			
			int min=Math.min(cnt0, cnt1);
			if(min%2==0)System.out.println("NET");
			else System.out.println("DA");
		}
	}
}
