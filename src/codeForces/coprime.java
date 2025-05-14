package codeForces;

import java.util.*;

public class coprime {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n+1];
			HashMap<Integer,Integer>map=new HashMap<>();
			
			for(int i=1;i<=n;i++) {
				arr[i]=scan.nextInt();
				map.put(arr[i], i);
			}
			int ans=-1;
			
			for(Map.Entry<Integer, Integer>m:map.entrySet()) {
				for(Map.Entry<Integer, Integer>k:map.entrySet()) {
					if(isGcd(m.getKey(),k.getKey())==1) ans=Math.max(ans, m.getValue()+k.getValue());
				}
			}
			System.out.println(ans);
		}
	}
	public static int isGcd(int a,int b) {
		if (b == 0) return a;
        return isGcd(b, a % b);
	}
}
