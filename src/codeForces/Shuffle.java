package codeForces;
import java.util.*;
public class Shuffle {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			long n = scan.nextLong();
			int x = scan.nextInt();
			int m = scan.nextInt();
			
			int a = x , b = x;
			for(int i = 0 ; i < m ; i++) {
				int l = scan.nextInt();
				int r = scan.nextInt();
				
				if(l <= a && r >= a) a = l;
				if(l <= b && r >= b) b = r;
			}
//			System.out.println(a +" "+b);
			System.out.println(b - a + 1);	
		}
	}
}
