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
		    
		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    int ans = 0;
		    for (int i = 0; i < n; i++) {
		        int val = a[i] - i;
		        
		        ans += map.getOrDefault(val, 0);
		        map.put(val, map.getOrDefault(val, 0) + 1);
		    } 
		    System.out.println(ans);
		}
	}
}
