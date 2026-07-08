import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while (tc-- > 0) {
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int runningMax = -1;
            long ans = 0;
            
            for (int i = 0; i < n; i++) {
                runningMax = Math.max(runningMax, arr[i]);
                ans += ((runningMax - arr[i]) > 0 ? runningMax - arr[i] : 0);
            }
            System.out.println(ans);
        }
	}
}
