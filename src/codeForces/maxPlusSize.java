package codeForces;
import java.util.*;
public class maxPlusSize {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextInt();
			
			int sum1=0;
			int max1=-1;
			
			for(int i=0;i<n;i+=2) {
				max1=Math.max(max1, arr[i]);
				sum1++;
			}
			sum1+=max1;
			
			int sum2=0;
			int max2=-1;
			
			for(int i=1;i<n;i+=2) {
				max2=Math.max(max2, arr[i]);
				sum2++;
			}
			sum2+=max2;
			
			int sum=-1;
			sum=Math.max(sum2, sum1);
			System.out.println(sum);
		}
	}
}
