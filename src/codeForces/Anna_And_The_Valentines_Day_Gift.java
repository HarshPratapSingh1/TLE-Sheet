package codeForces;
import java.util.*;
public class Anna_And_The_Valentines_Day_Gift {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long m = scan.nextLong(),cnt = 0 , total = 0;

			long arr[] = new long[n];
			
			ArrayList<Long> l = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextLong();
				
				total += String.valueOf(arr[i]).length();
		
				if(arr[i] % 10 == 0) l.add(findDig(arr[i]));
			}
			
			Collections.sort(l);
			Collections.reverse(l);
			
			for(int i = 0 ; i < l.size() ; i += 2) cnt += l.get(i);
			
			System.out.println((total - cnt) > m ? "Sasha" : "Anna");
		}
	}
	public static long findDig(long arr) {
		long cnt = 0;
		while(arr > 0) {
			if(arr % 10 == 0) cnt++;
			else break;
			arr /= 10;
		}
		return cnt;
	}
}


