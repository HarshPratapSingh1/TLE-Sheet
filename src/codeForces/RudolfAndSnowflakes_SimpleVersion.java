package codeForces;
import java.util.*;
public class RudolfAndSnowflakes_SimpleVersion {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			long n = scan.nextLong();
			
			if(n < 7) {
				System.out.println("NO");
				continue;
			}
			
			boolean flag = false;
			long ini = 7 ;
			long toAdd = 6;
			for(int k = 2 ; k < 1000 ; k++) {
				long startSum = k * k * k;
				long val = ini;
				while(val < n) {
					val += startSum;
					startSum *= k;
				}
				ini += toAdd;
				toAdd += 2;
				if(val == n) {
					flag = true;
					System.out.println("YES");
					break;
				}
				
			}
			if(!flag) System.out.println("NO");
		}
	}
}
