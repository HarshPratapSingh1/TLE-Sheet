package codeForces;
import java.util.*;
public class Scuza {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			int q = scan.nextInt();
			
			long arr[] = new long[n];
			
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
			
			long prefix[] = new long[n];
			long prefixMax[] = new long[n];
			
			
//			prefix[0]=arr[0];
			long max = arr[0];
			for(int i = 0 ; i < n ; i++) {
				max = Math.max(max, arr[i]);
				prefixMax[i] = max;
			}
			
			prefix[0] = arr[0];
			for(int i = 0 ; i < n - 1 ;i++) prefix[i + 1] = prefix[i] + arr[i + 1];
 			
			ArrayList<Long> list = new ArrayList<>();
			
			for(int i = 0 ; i < q ; i++) {
				long k = scan.nextLong();
				
				int l = 0;
				int r = n - 1;
				while(l <= r) {
					int mid = l + (r - l)/2;
					if(prefixMax[mid]>k) {
						r = mid - 1;
					}else l = mid + 1;
				}
				list.add((r>=0 && r < n)?prefix[r]:0);
			}
		for(long it : list)System.out.print(it+" ");
		System.out.println();
		}
	}
}
