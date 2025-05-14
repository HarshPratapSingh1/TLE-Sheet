package codeForces;
import java.util.*;
public class ContrastValue {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			long arr[] = new long [n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();
				
			long contrast = 0;
			
			for(int i = 0 ; i < n - 1 ; i++) contrast += Math.abs((arr[i] - arr[i + 1]));
			
			if(contrast == 0)System.out.println(1);
			else {				
				ArrayList<Long>l=new ArrayList<>();
				for(long it :arr) {
					if(l.size()>0 && l.get(l.size()-1)!=it)l.add(it);
					if(l.size()==0)l.add(it);
				}
				long ans = 2;
				for(int i = 1 ; i < l.size() - 1 ; i++) {
					if((l.get(i)>l.get(i+1)&&l.get(i)>l.get(i-1))||(l.get(i)<l.get(i+1)&&l.get(i)<l.get(i-1)))ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
