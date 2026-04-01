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
            
            int[] a = new int[n];
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (max != a[i] && min != a[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}
