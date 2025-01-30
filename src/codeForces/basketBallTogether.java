package codeForces;
import java.util.*;
public class basketBallTogether {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int d=scan.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=scan.nextInt();
		
		Arrays.sort(arr);
		int cnt=0;
		int i=-1;
		int j=n-1;
		long cur=arr[j];
		while(i<j) {
			int ans=arr[j];
			if(cur<=d) {
				i++;
				cur+=ans;
			}else {
				j--;
				cnt++;
				if(j>=0)cur=arr[j];
			}
		}
		System.out.println(cnt);

	}
}
