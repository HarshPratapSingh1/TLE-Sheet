package codeForces;
import java.util.*;
public class meetingFriends_newYear {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int x3=scan.nextInt();
		
		int sum1[]= {x1,x2,x3};
		Arrays.sort(sum1);
		int sum=sum1[1];
		
		int first=Math.abs(sum-x1);
		int second=Math.abs(sum-x2);
		int third=Math.abs(sum-x3);
		
		System.out.println(first+second+third);
	}
}
