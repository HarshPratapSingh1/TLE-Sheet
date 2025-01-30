package codeForces;
import java.util.*;
public class oddGrasshopper {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			long x=scan.nextLong();
			long n=scan.nextLong();
			
			long res=x;
			long s=(x%2!=0)?1:-1;
			if(n % 4 == 1){res += s * n;}
	        else if(n % 4 == 2){res -= s;}
	        else if(n % 4 == 3){res -= s * (n + 1);}
			
			System.out.println(res);
		}
	}
}
