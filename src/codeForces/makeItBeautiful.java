package codeForces;
import java.util.*;
public class makeItBeautiful {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-- >0) {
			int n=scan.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			  Arrays.sort(arr);

	            // Step 2: Check if the sorted array is already beautiful
	            boolean isBeautiful = true;
	            int sum = 0;
	            for (int i = 0; i < n; i++) {
	                if (arr[i] == sum) {
	                    isBeautiful = false;
	                    break;
	                }
	                sum += arr[i];
	            }

	            // Step 3: If sorted array is beautiful, print it
	            if (isBeautiful) {
	                System.out.println("YES");
	                for (int a : arr) {
	                    System.out.print(a + " ");
	                }
	                System.out.println();
	            } else {
	                // Step 4: If sorted array is not beautiful, try to swap the first and the last elements
	                int[] beautifulArray = new int[n];
	                for (int i = 0; i < n; i++) {
	                    beautifulArray[i] = arr[i];
	                }
	                System.out.println(Arrays.toString(beautifulArray));
	                // Swap the first and the last elements
	                int temp = beautifulArray[0];
	                beautifulArray[0] = beautifulArray[n - 1];
	                beautifulArray[n - 1] = temp;

	                System.out.println(Arrays.toString(beautifulArray));
	                // Check if this new arrangement is beautiful
	                isBeautiful = true;
	                sum = 0;
	                for (int i = 0; i < n; i++) {
	                    if (beautifulArray[i] == sum) {
	                        isBeautiful = false;
	                        break;
	                    }
	                    sum += beautifulArray[i];
	                }

	                if (isBeautiful) {
	                    System.out.println("YES");
	                    for (int a : beautifulArray) {
	                        System.out.print(a + " ");
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("NO");
	                }
	            }
	        }
	        scan.close();
		
	}
}
