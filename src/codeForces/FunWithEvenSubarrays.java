package codeForces;
import java.util.*;
public class FunWithEvenSubarrays {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		
		while(t-->0) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++)arr[i] = scan.nextInt();
			
			HashMap<Integer,Integer>map = new HashMap<>();
			
			for(int i=0;i<n;i++) map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			int backIdx = (int)1e9;
			int cnt = 0;
			int len = -1;
			
			int i=arr.length-1;
			while(i>=0) {
				if(arr[i]==arr[n-1]) {
					i--;
					continue;
				}
				else {
					cnt++;
					backIdx=i+1;
					len=(n-backIdx);
					i-=(len);
				}
				
			}
			
			System.out.println(cnt);
		}
	}
}
