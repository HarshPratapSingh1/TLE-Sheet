package codeForces;
import java.util.*;
public class ambitiousKid {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			arr[i]=Math.abs(a-0);
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
	}
}
