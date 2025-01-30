package codeForces;
import java.util.*;
public class hQ9plus {
	public static void main (String[]args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		int arr[]=new int [s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		
//		|| arr[0]==43
		int flag=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==72 || arr[i]==81 || arr[i]==57 )
			flag=1;
		}
		if(flag==1)System.out.println("YES");
		else System.out.println("NO");
		
		scan.close();
	}
}
