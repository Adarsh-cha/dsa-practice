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
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            int i = (((n - k) + 1) / 2) - 1;
            int j = n - ((n - k) - (i + 1)) - 1;
            int prev = Integer.MIN_VALUE;
            
            while (i <= j) {
                if (a[i] != prev) {
                    System.out.print(a[i] + " ");
                    prev = a[i];
                }
                i++;
            }
            System.out.println();
        }

        sc.close();
	}
}
