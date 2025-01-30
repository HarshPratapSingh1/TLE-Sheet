package codeForces;
import java.util.*;
public class word {
	public static void main(String[]args) {
		Scanner scan = new  Scanner(System.in);
		String s = scan.next();
		
		int uCnt = 0;
		int lCnt = 0;
		for(int i = 0 ;i < s.length() ; i++) {
			if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<26)uCnt++;
			
			else if(s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<26)lCnt++;
		}
		if(uCnt>lCnt)System.out.println(s.toUpperCase());
		
		else System.out.println(s.toLowerCase());
	}
}
