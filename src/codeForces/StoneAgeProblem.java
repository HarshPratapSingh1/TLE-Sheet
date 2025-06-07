package codeForces;
import java.util.*;
public class StoneAgeProblem {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		
		LazyLongArray arr = new LazyLongArray(n, -1);

		long sum = 0;
		for(int i = 0 ; i < n ; i++) {
			arr.set(i, scan.nextLong());
			sum += arr.get(i);
		}
		
		while(q-->0) {
			int task = scan.nextInt();
			
			if(task == 1) {
				int idx = scan.nextInt();
				long x = scan.nextLong();
				
				long ele = arr.get(idx - 1);
				arr.set(idx - 1, x);
				
				sum = sum - ele + x;
				
				System.out.println(sum);
			}else {
				long x = scan.nextLong();
				
				arr.reset(x);
				sum = x * n;
				System.out.println(sum);
			}
//			System.out.println(Arrays.toString(LazyLongArray.data));
		}
	}
}
class LazyLongArray {
    private long[] data;
    private int[] version;
    private int currentVersion = 1;
    private long defaultValue;

    public LazyLongArray(int size, long defaultValue) {
        data = new long[size];
        version = new int[size];
        this.defaultValue = defaultValue;
    }

    public void set(int i, long val) {
        data[i] = val;
        version[i] = currentVersion;
    }

    public long get(int i) {
        return version[i] == currentVersion ? data[i] : defaultValue;
    }

    public void reset(long newDefault) {
        currentVersion++;
        defaultValue = newDefault;
    }
}
