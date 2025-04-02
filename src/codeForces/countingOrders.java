package codeForces;
import java.io.*;
import java.util.*;
public class countingOrders {
    static final int MOD = (int) 1e9 + 7;

	public static void main(String[]args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        int t = Integer.parseInt(br.readLine());
	        
	        while (t-- > 0) {
	            int n = Integer.parseInt(br.readLine());
	            int[] a = new int[n];
	            int[] b = new int[n];
	            
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            for (int i = 0; i < n; i++) {
	                a[i] = Integer.parseInt(st.nextToken());
	            }
	            
	            st = new StringTokenizer(br.readLine());
	            for (int i = 0; i < n; i++) {
	                b[i] = Integer.parseInt(st.nextToken());
	            }
	            
	            Arrays.sort(a);
	            Arrays.sort(b);
	            
	            boolean valid = true;
	            for (int i = 0; i < n; i++) {
	                if (a[i] <= b[i]) {
	                    bw.write("0\n");
	                    valid = false;
	                    break;
	                }
	            }
	            if (!valid) continue;
	            
	            long ans = 1;
	            for (int i = 0; i < n; i++) {
	                int low = i, high = n - 1, pos = i - 1;
	                while (low <= high) {
	                    int mid = low + (high - low) / 2;
	                    if (a[i] > b[mid]) {
	                        pos = mid;
	                        low = mid + 1;
	                    } else {
	                        high = mid - 1;
	                    }
	                }
	                ans = (ans * (pos - i + 1)) % MOD;
	            }
	            bw.write(ans + "\n");
	        }
	        
	        bw.flush();
	        br.close();
	        bw.close();
	    }
	}
