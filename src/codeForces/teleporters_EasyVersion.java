package codeForces;
import java.util.*;
public class teleporters_EasyVersion {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			long c=scan.nextLong();
			
			long arr[][]=new long[n][2];
			
			for(int i=0;i<n;i++) {
				arr[i][0]=scan.nextInt();
				arr[i][1]=i;
			}
			
			Arrays.sort(arr,(x,y)->Long.compare(x[0], y[0]));
			
			PriorityQueue<Long>pq=new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				pq.add(arr[i][0]+arr[i][1]+1);
			}
//			System.out.println(pq);
			long cnt=0;
			while(!pq.isEmpty()&&c-pq.peek()>=0) {
				c-=pq.poll();
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
