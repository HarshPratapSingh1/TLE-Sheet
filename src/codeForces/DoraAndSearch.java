package codeForces;
import java.util.*;
public class DoraAndSearch {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int arr[] = new int [n];
			
			for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
		
			PriorityQueue <Integer> min = new PriorityQueue<>();
			PriorityQueue <Integer> max = new PriorityQueue<>(Collections.reverseOrder());
			
			for(int i = 0 ; i < n ; i++) {
				min.add(arr[i]);
				max.add(arr[i]);
			}
			
			int i  = 0 , j = n - 1;
			boolean flag = false;
			while(i < j) {
				if(arr[i] != min.peek() && arr[i] != max.peek() && arr[j] != min.peek()&& arr[j] != max.peek()) {
					flag = true;
					break;
				}
				else if(arr[i] == min.peek() || arr[i] == max.peek()) {
					if(arr[i]==min.peek())min.poll();
					if(arr[i]==max.peek())max.poll();
					i++;
				}
				else if(arr[j] == min.peek() || arr[j] == max.peek()) {
					if(arr[j]==min.peek())min.poll();
					if(arr[j]==max.peek())max.poll();
					j--;
				}
			}
			if(flag)System.out.println((i + 1)+" "+(j + 1));
			else System.out.println(-1);
		}
	}
}
