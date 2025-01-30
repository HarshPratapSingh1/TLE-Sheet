package codeForces;
import java.util.*;
public class beautifulMatrix {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int matrix[][]=new int [5][5];
		int row=-1;
		int col=-1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matrix[i][j]=scan.nextInt();
				if(matrix	[i][j]==1) {
					row=i;
					col=j;
				}
			}
		}
		
		int moves=Math.abs(2-row)+Math.abs(2-col);
		
		System.out.println(moves);
		
		
	}
}
