package codeForces;
import java.util.*;
public class swapAndDelete {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			String s=scan.next();
			
		
			int cnt1=0,cnt0=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1')cnt1++;
				if(s.charAt(i)=='0')cnt0++;
			}
			for(int i=0;i<=s.length();i++) {
				if(i==s.length()) {
					System.out.println(s.length()-i);
					break;
				}
				if(s.charAt(i)=='0') {
					if(cnt1==0) {
					System.out.println(s.length()-i);
					break;
					}
				}
				if(s.charAt(i)=='1') {
					if(cnt0==0) {
					System.out.println(s.length()-i);
					break;
					}
				}
				
				if(s.charAt(i)=='1')cnt0--;
				if(s.charAt(i)=='0')cnt1--;
			}
			
		}
	}
}
