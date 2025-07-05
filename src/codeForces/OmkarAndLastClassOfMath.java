package codeForces;
import java.util.*;
public class OmkarAndLastClassOfMath {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			long n = scan.nextLong();
			
			if(n % 2 == 0) System.out.println((n / 2) +" "+ (n / 2));
			else {
				long val = n;
				for(long i = 2 ; i * i <= n ; i++) {
					if(n % i == 0) {
						val = i;
						break;
					}
				}
				long a = n / val;
				long b = n - a;
				
				System.out.println(a+" "+b);
			}
		}
	}
}
