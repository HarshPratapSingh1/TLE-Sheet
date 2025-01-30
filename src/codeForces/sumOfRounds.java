package codeForces;
import java.util.*;
public class sumOfRounds {
	public static void main(String[]args) {
		  Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        scanner.nextLine(); // consume the remaining newline
	        
	        ArrayList<String> results = new ArrayList<>();
	        
	        for (int i = 0; i < t; i++) {
	            String num = scanner.nextLine();
	            ArrayList<String> roundNumbers = new ArrayList<>();
	            
	            int length = num.length();
	            
	            for (int j = 0; j < length; j++) {
	                if (num.charAt(j) != '0') {
	                    StringBuilder roundNumber = new StringBuilder();
	                    roundNumber.append(num.charAt(j));
	                    for (int k = j + 1; k < length; k++) {
	                        roundNumber.append('0');
	                    }
	                    roundNumbers.add(roundNumber.toString());
	                }
	            }
	            
	            results.add(String.valueOf(roundNumbers.size()));
	            results.addAll(roundNumbers);
	        }
	        
	        for (String result : results) {
	            System.out.println(result);
	        }
	        
	        scanner.close();
	        }
}
