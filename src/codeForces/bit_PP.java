package codeForces;
import java.util.*;
public class bit_PP {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
	        String x = scanner.nextLine();
	        char[] digits = x.toCharArray();
	        
	        for (int i = 0; i < digits.length; i++) {
	            int currentDigit = digits[i] - '0';
	            int invertedDigit = 9 - currentDigit;
	            
	            // Avoid leading zero
	            if (i == 0 && invertedDigit == 0) {
	                continue;
	            }
	            
	            // Choose the smaller value between the current digit and its inversion
	            if (invertedDigit < currentDigit) {
	                digits[i] = (char) (invertedDigit + '0');
	            }
	        }
	        
	        System.out.println(new String(digits));
	}
}
