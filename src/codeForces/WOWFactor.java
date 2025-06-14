package codeForces;
import java.util.*;
public class WOWFactor {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int WFrontcnt = 0 ;
		int WBackcnt = 0;
		
		for(int i = s.length() - 1 ; i > 0 ; i--) if(s.charAt(i) == 'v' && s.charAt(i - 1) == 'v')WBackcnt++;
//		System.out.println(WBackcnt);
		long ans = 0;
		int vCnt = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'o') {
				WFrontcnt += (vCnt > 1 ? vCnt - 1 : 0);
				vCnt = 0;
				ans += (WFrontcnt * (Math.abs(WBackcnt - WFrontcnt)));
			}else vCnt++;
		}
		System.out.println(ans);
	}
}
