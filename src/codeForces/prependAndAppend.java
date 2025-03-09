package codeForces;
import java.util.*;
public class prependAndAppend {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			String s=scan.next();
			
			int i=0;
			int j=n-1;
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j)) {
					i++;
					j--;
				}else break;
			}
			
			System.out.println(j-i+1);
		}
	}
}	
