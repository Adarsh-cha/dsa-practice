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
            
            boolean found = true;
            for (int i = 1; i < n; i++) {
                if ((a[i - 1] & a[i]) == 0) {
                    continue;
                }
                else {
                    found = false;
                }
            }
            
            System.out.println(found ? "Yes" : "No");
        }

        sc.close();
	}
}
