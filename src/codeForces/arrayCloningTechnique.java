package codeForces;
import java.util.*;
import java.util.Map.Entry;
public class arrayCloningTechnique {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			HashMap<Integer,Integer>map=new HashMap<>();
			for(int i=0;i<n;i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
			
			int freq=0;
			for(Entry<Integer, Integer>m:map.entrySet()) {
				if(freq<m.getValue()) {
					
					freq=m.getValue();
				}
			}
			int cnt=0;
			while(freq<n) {
				cnt++;
				
				if(n-freq>=freq) {
					cnt+=freq;
					freq*=2;
				}else {
					cnt+=n-freq;
					freq=n;
				}
			}
			System.out.println(cnt);
		}
	}
}
