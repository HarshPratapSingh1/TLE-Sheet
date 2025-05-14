package codeForces;
import java.util.*;
public class Make_Almost_Equal_With_Mod {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long arr[] = new long[n];

			Long cnt = 2L;
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			
			while(true) {
				HashSet<Long>set=new HashSet<>();
				for(int i=0;i<arr.length;i++)set.add(arr[i]%cnt);
				
				if(set.size()==2)break;
				
				cnt*=2;
			}
			System.out.println(cnt);
		
		}
	}
}
