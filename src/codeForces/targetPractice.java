package codeForces;
import java.util.*;
public class targetPractice {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		 scan.nextLine();
		
		while(t-- >0) {
			char a[][]=new char[10][10];
			 for (int i = 0; i < 10; i++) {
	                String line = scan.nextLine();
	                a[i] = line.toCharArray();
	                
	            }
			
			int sum=0;
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					if(a[i][j]=='X') {
						sum+=score(i, j);
					}
				}
			}
			System.out.println(sum);
			
		}
		scan.close();
	}
	public static int score(int i,int j) {
		int scorea[][]= {{1,1,1,1,1,1,1,1,1,1},
						{1,2,2,2,2,2,2,2,2,1},
						{1,2,3,3,3,3,3,3,2,1},
						{1,2,3,4,4,4,4,3,2,1},
						{1,2,3,4,5,5,4,3,2,1},
						{1,2,3,4,5,5,4,3,2,1},
						{1,2,3,4,4,4,4,3,2,1},
						{1,2,3,3,3,3,3,3,2,1},
						{1,2,2,2,2,2,2,2,2,1},
						{1,1,1,1,1,1,1,1,1,1}};
		return scorea[i][j];
	}
}
