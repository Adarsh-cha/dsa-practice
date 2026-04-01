import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int[] a = new int[n];
		    int max = -1;
		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		        max = Math.max(max, a[i]);
		    }
		    
		    int start = 1;
		    int end = max;
		    int ans = 0;
		    
		    while (start <= end) {
		        int mid = start + (end - start) / 2;
		        
		        int tem = 0;
		        for (int num : a) {
		            tem += (num / mid);
		        }
		        
		        if (tem >= m) {
		            ans = mid;
		            start = mid + 1;
		        }
		        else {
		            end = mid - 1;
		        }
		    }
		    System.out.println(ans);
	}
}
