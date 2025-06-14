package codeForces;
import java.util.*;
public class AlyonaAndANarrowFridge {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
        
        int answer = 0;

        for (int i = 0 ; i <= n ; i++) {
            int[] temp = Arrays.copyOfRange(arr, 0, i);
            Arrays.sort(temp);
            int sum = 0;

            for (int j = temp.length - 1 ; j >= 0 ; j -= 2) sum += temp[j];

            if (sum <= k) {
//            	System.out.println(Arrays.toString(temp));
//            	System.out.println(i+" "+sum);
            	answer = i;
            }
            
            else break;
            
        }

        System.out.println(answer);
    }
}