package codeForces;
import java.util.*;
public class valeriiAgainstEveryone {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long b[]=new long[n];
			HashSet<Long>set=new HashSet<>();

			for(int i=0;i<n;i++) {
				b[i]=scan.nextLong();
				set.add(b[i]);
			}

			System.out.println(set.size()==n?"NO":"YES");
		}
	}
}
