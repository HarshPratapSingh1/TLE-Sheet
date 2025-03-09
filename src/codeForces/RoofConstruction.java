package codeForces;
import java.util.*;
public class RoofConstruction {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0) {
			int n=scan.nextInt();
			String s=Integer.toBinaryString(n-1);
			
			int maxVal=(int)Math.pow(2, s.length()-1);
		
			for(int i=n-1;i>=maxVal;i--) {
				System.out.print(i+" ");
			}
			for(int i=0;i<maxVal;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
