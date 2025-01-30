package codeForces;
import java.util.*;

public class lightOut {
	public static void main(String[]args) {
		int arr[][]=new int[3][3];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		scan.close();
		int ini[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ini[i][j]=1;
				}
			}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]%2!=0) {
					change(ini,i,j);
				}		
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ini[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void change(int ini[][],int row,int col) {
		ini[row][col]=1-ini[row][col];
		
		if(row-1>=0)ini[row-1][col]=1-ini[row-1][col];
		if(row+1<3)ini[row+1][col]=1-ini[row+1][col];
		if(col-1>=0)ini[row][col-1]=1-ini[row][col-1];
		if(col+1<3)ini[row][col+1]=1-ini[row][col+1];
		
		
	}
}
