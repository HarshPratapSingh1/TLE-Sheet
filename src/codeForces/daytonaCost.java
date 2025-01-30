package codeForces;
import java.util.*;
public class daytonaCost {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			
			HashMap<Integer,Integer>map=new HashMap<>();
			for(int i=0;i<n;i++) {
				if(map.containsKey(arr[i])) {
					map.replace(arr[i], map.get(arr[i])+1);
				}else map.put(arr[i], 1);
			}
			
			if(!map.containsKey(k))System.out.println("NO");
			else {
				System.out.println("YES");
			}
		}
	}
}
