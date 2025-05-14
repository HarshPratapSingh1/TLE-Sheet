package codeForces;

import java.util.*;

public class YetAnotherCardDeck {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		int q = scan.nextInt();
		
		int arr[]=new int [n];
		int color[]=new int[51];
		
		Arrays.fill(color, -1);
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();	
			if(color[arr[i]]==-1)color[arr[i]]=i;
		}
//		System.out.println(Arrays.toString(color));
		while(q-->0) {
			int t = scan.nextInt();
			
			int val=color[t];
			for(int i=0;i<51;i++)if(color[i]!=-1&&color[i]<val)color[i]++;
			
			color[t]=0;
			System.out.print(val+1+" ");
		}	
		System.out.println();
	}
}
