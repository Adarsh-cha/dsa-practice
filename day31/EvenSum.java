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
            int sum = 0;
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (((sum - a[i]) % 2 == 0)) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

        sc.close();	

	}
}
