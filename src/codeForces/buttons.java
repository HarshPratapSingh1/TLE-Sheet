package codeForces;
import java.util.*;
public class buttons {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			
			 if (c % 2!=0 && a==b) System.out.println("First");
		      else if (a > b) System.out.println("First");
		      else System.out.println("Second");
			
		}scan.close();
	}
}
