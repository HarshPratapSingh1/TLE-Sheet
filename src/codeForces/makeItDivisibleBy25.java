package codeForces;
import java.util.*;
public class makeItDivisibleBy25 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t-->0){
		    String s=scan.next();
		    
		    boolean flag5=false,flag0=false;
		    int idx1=-1,idx2=-1;
		    for(int i=s.length()-1;i>=0;i--) {
		    	if(s.charAt(i)=='5'&&!flag5) {
		    		idx2=i;
		    		flag5=true;
		    	}
		    	else if(flag5) {
		    		if(s.charAt(i)=='2'||s.charAt(i)=='7') {
		    			idx1=i;
		    			flag5=false;
		    			break;
		    		}
		    		
		    	}
		    	if(s.charAt(i)=='0'&&!flag0) {
		    		idx2=i;
		    		flag0=true;
		    	}
		    	else if(flag0) {
		    		if(s.charAt(i)=='0'||s.charAt(i)=='5') {
		    			idx1=i;
		    			break;
		    		}
		    		
		    	}
		    }
		    long steps=idx2-idx1-1;
		    if(idx2!=s.length()-1)steps+=s.length()-idx2-1;
		    
		    System.out.println(steps);
		}
	}
}
