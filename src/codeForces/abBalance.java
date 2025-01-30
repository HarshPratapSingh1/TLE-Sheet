package codeForces;
import java.util.*;
public class abBalance {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			String s=scan.next();
			StringBuilder s1=new StringBuilder(s);
			if(s.charAt(0)!=s.charAt(s.length()-1)) {
				s1.setCharAt(0, s.charAt(s.length()-1));
			}
			System.out.println(s1.toString());
		}
	}
}
