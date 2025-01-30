package codeForces;
import java.util.*;
public class shoeShuffling {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long n=scan.nextLong();
			long arr[]=new long [(int)n];
			
			for(int i=0;i<n;i++)arr[i]=scan.nextLong();
			
			int i=0;
			int j=0;
			ArrayList<Integer>l=new ArrayList<>();
			boolean flag=false;
			
			while(i<n) {
				while(j<n&&arr[i]==arr[j]) {
					j++;
				}
				if(j-i==1) {
					flag=true;
					break;
				}
				doSuffle(l, i, j);
				i=j;
			}
			if(flag)System.out.println(-1);
			else {
				for(int it:l) {
					System.out.print(it+" ");
				}
				System.out.println();
			}
		}
	}
	public static void doSuffle(ArrayList<Integer>l,int start,int end) {
//		System.out.println(start+" "+end);
		l.add(end);
		for(int i=start+1;i<end;i++)l.add(i);
//		System.out.print(l+"// \n");
	}
}
