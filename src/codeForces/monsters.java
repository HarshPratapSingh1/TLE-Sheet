package codeForces;
import java.util.*;
public class monsters {
	public static void solve(long n,long k,long arr[]) {
       

        // List to store pairs of (residual, index)
        List<long[]> hMap = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            long res = arr[i] % k;
            if (res == 0) {
                res += k; // Adjust if the residual is zero
            }
            hMap.add(new long[]{-res, i + 1}); // Store as {residual, index} (1-based)
        }
//        System.out.println(hMap);
        // Sorting based on residual and index
        hMap.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Long.compare(a[1], b[1]); // Sort by index if residual is the same
            }
            return Long.compare(a[0], b[0]); // Sort by residual
        });

        // Output the sorted order of indices
        for (long[] ele : hMap) {
            System.out.print(ele[1] + " "); // Print index (1-based)
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long T = scan.nextLong(); // Number of test cases
        while (T-- > 0) {
        	  long n = scan.nextLong(); // Number of monsters
              long k = scan.nextLong(); // Damage dealt per attack
              
              long[] arr = new long[(int) n]; // Array to store health points of monsters
              for (int i = 0; i < n; i++) {
                  arr[i] = scan.nextLong(); // Read each monster's health
              }
        	solve(n,k,arr); 
        }
        
        scan.close(); // Close the scanner
    }
}
