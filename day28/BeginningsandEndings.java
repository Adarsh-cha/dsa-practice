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
            HashMap<Integer, Integer> first = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (first.containsKey(a[i])) {
                    int ans1 = (first.get(a[i]) - 0) + ((n - 1) - i);
                    ans = Math.min(ans, ans1);
                }
                
                first.putIfAbsent(a[i], i);
            }
            
            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }

        sc.close();
	}
}
