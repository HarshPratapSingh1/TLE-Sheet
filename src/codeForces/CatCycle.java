package codeForces;
import java.util.*;
public class CatCycle {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			long n = scan.nextLong();
			long k = scan.nextLong() - 1;

			if(n % 2 == 0) System.out.println(k % n +1);
            
			else System.out.println((k + (k / (n / 2))) % n + 1);
			
		}
	}
}
