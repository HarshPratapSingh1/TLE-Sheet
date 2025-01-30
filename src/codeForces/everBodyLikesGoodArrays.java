package codeForces;
import java.util.*;
public class everBodyLikesGoodArrays {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			
			List<Integer>l=new ArrayList<>();
			int cnt=0;
			for(int i=0;i<n-1;i++) {
				if(arr[i]%2==arr[i+1]%2) {
					l.add(arr[i]*arr[i+1]);
					cnt++;
				}else l.add(arr[i+1]);
			}
					System.out.println(cnt);
		}
	}
}
