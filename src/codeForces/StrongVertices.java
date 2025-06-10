package codeForces;
import java.util.*;
public class StrongVertices {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			
			long arr[] = new long[n];
			long brr[] = new long[n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			for(int j = 0 ; j < n ; j++) brr[j] = scan.nextLong();
			
			long max = Long.MIN_VALUE;
			
			for(int i = 0 ; i < n ; i++) max = Math.max(max, arr[i]-brr[i]);
			
			
			ArrayList<Integer> l = new ArrayList<>();
			
			for(int i = 0 ; i < n ; i++){
				if(arr[i] - brr[i] == max) l.add(i + 1);
			}
			
			System.out.println(l.size());
			for(int it : l) System.out.print(it+" ");
			
			System.out.println();
		}
	}
}
