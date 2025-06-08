package codeForces;
import java.util.*;
public class RemovingSmallestMultiples {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0) {
			int n = scan.nextInt();
			String s = scan.next();
			
			StringBuilder sb = new StringBuilder();
			sb.append(" ");
			sb.append(s);
//			System.out.println(sb.toString());
			
			long cnt = 0;
			for(int i = 1 ; i <= n ; i++) {
			
				for(int j = i ; j <= n ; j+= i) {
					if(s.charAt(j - 1) == '1') break;
					else {
						if(sb.charAt(j) == '0') {
							cnt += i;
							sb.setCharAt(j, '1');
						}
					}
				}
//				System.out.println(sb.toString());
			}
			System.out.println(cnt);
		}
	}
}
