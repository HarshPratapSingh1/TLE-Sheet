package codeForces;
import java.util.*;
public class ArrayElimination {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- >0 ) {
			int n = scan.nextInt();
			long arr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			int val = 30;
			int freq[] = new int[(int)val];
			
			for(int i = 0 ; i < n ; i++) {
				StringBuilder sb = new StringBuilder(Long.toBinaryString(arr[i]));
				sb.reverse();
				for(int j = 0 ; j < val ; j++) {
					if(j < sb.length()) freq[j] += Long.parseLong(String.valueOf(sb.charAt(j)));
					else break;
				}
			}
//			System.out.println(Arrays.toString(freq));
//			boolean flag = true;
//			for(int i = 0 ;i < val ; i++) {
//				if(freq[i] != 0) {flag = false; break;}
//			}
//			if(flag) {
//				for(int i = 0 ; i < n ; i++) System.out.print(i+1+" ");
//				System.out.println();
//				continue;
//			}
 
			TreeSet<Integer> set = new TreeSet<>();
//			set.add(1);
			for(int i = 1 ; i <= n ; i++) {
				boolean flag = true;
				for(int j = 0 ; j < val ; j++) {
					if(freq[j] % i != 0) {
						flag = false; 
						break;
					}
				}
				if(flag) set.add(i);
			}
			
			for(int it:set) System.out.print(it+" ");
			System.out.println();
		}
	}
}