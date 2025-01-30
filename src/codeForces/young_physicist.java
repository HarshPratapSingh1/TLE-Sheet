package codeForces;
import java.util.Arrays;
import  java.util.Scanner;
public class young_physicist {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		String s = scan.next();
		
		StringBuilder str=new StringBuilder(s);
		
		for(int i = 0 ;i < t ; i++) {
			for(int j = 0 ; j < n - 1 ; j++) {
				if( str.charAt(j) == 'B' && str.charAt(j+1) == 'G') {
					str.setCharAt(j, 'G');
                    str.setCharAt(j + 1, 'B');
                    // Skip the next character to prevent double swap
                    j++;
				}	
			}
		}
		
		
		System.out.println(str.toString());
	}
}
