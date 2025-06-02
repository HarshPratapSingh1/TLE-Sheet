package codeForces;
import java.util.*;
public class Palindrome_Game_easy_version {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			String s = scan.next();
			
			int cnt = 0;
			for(char c : s.toCharArray()) if(c == '0') cnt++;
			
			if(cnt % 2 == 0 || cnt <= 1) {
				 System.out.println("BOB");
			} else System.out.println("ALICE");
		}
	}
}
