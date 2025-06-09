package codeForces;
import java.util.*;
public class RomanticGlasses {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextLong();
				if((i & 1) == 1) arr[i] *= -1;
			}
			
			long prefix[] = new long[n];
			prefix[0] = arr[0];
			
			for(int i = 1 ; i < n ; i++) prefix[i] = arr[i] + prefix[i - 1];
			
			HashSet<Long> set = new HashSet<>();
			boolean flag = false;

			for(int i = 0 ; i < n ; i++) {
				if(set.contains(prefix[i]) || prefix[i] == 0) {
					flag = true;
					break;
				}
				set.add(prefix[i]);
			}
			
			System.out.println(flag ? "YES":"NO");
		}
	}
}
