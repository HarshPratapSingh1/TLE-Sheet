package codeForces;
import java.util.*;
public class MoveAndTurn {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n % 2 == 0) System.out.println(((n/2) + 1) * ((n/2) + 1));	
		
		else System.out.println(2*((n/2)+2)*((n/2)+1));
			
	}
}