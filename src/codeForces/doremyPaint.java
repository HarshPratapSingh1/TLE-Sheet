package codeForces;
import java.util.*;
public class doremyPaint {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			int cnt=0;
			
			if(n<3)System.out.println("Yes");
			else {
			int k=arr[0]+arr[1];
			
			Map<Integer,Integer>map=new HashMap<>();
			
			for(int i=1;i<n-1;i++) {
				if(arr[i]+arr[i+1]!=k) {
					cnt++;
				}
			}
			
			for(int i=0;i<n;i++) {
				if(map.containsKey(arr[i]))map.replace(arr[i], map.get(arr[i])+1);
				
				else map.put(arr[i], 1);
			}
			Arrays.sort(arr);
			int dif=Integer.MAX_VALUE;
			if(map.size()==2) {
				dif=Math.abs(map.get(arr[0])-map.get(arr[n-1]));
			}
			if(dif<2 || cnt ==0)System.out.println("Yes");
			else System.out.println("No");
			}
		}
		scan.close();
	}
}
