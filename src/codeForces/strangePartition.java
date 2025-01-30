package codeForces;
import java.util.*;
public class strangePartition {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			long x=scan.nextLong();
			ArrayList<Integer>arr=new ArrayList<>();
			long max=0;
			long min=0;
			for(int i=0;i<n;i++) {
				arr.add(scan.nextInt());
				max+=(double)arr.get(i)/x;
				if(arr.get(i)%x!=0)max++;
				min+=arr.get(i);
			}
			long mina=min/x;
			if(min%x!=0)mina++;
			System.out.println(mina+" "+max);
		}
	}
}
