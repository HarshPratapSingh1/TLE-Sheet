package codeForces;
import java.util.*;
public class MaximalAND {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-->0) {
			int n = scan.nextInt();
			long k = scan.nextLong();
			
			long arr[] = new long[n];
			long map[] = new long[31];
			for(int i=0;i<31;i++)map[i]=0;

			for(int i = 0; i < n ; i++) {
				arr[i] = scan.nextLong();
				StringBuilder s = new StringBuilder(Integer.toBinaryString((int)arr[i]));
				s.reverse();
				for(int j = 0 ; j < s.length() ; j++) if(s.charAt(j) == '1')map[j]++;
			}
 
			int ans[] = new int[31];
			long to = k / n;
			long left = k % n;
			for(int i = 30 ;to>0 && i>=0; i--) {
				left+=map[i];
			    ans[i] = 1;
				to--;
				map[i]=-1;
			}
			//  System.out.println(left);
			
			ArrayList<Integer> l = new ArrayList<>();
			
			for(int i=0;i<31;i++){
				if(map[i]!=-1){
					l.add(i);
				}
			}
			
			Collections.sort(l);
	
			for(int i = l.size() - 1 ; i>= 0 ; i--) {
				if((n - map[l.get(i)])<=left) {
					left -= (n - map[l.get(i)]);
					ans[(int)l.get(i)] = 1;
				}
			}
			
			long val = arr[0];
			for(int i = 1 ; i < n ; i++) val &= arr[i];
			
			long x=0;
			for(int i=0;i<31;i++){
				if(ans[i]==1) x+=(1<<i);
			}
			val|=x;
			System.out.println(val);
		}
		scan.close();
	}
}