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
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int ans = 0;
            if (n < m) {
                ans = (n * c) + ((m - n) * b);

            }
            else if (n > m) {
                ans = (m * c) + ((n - m) * a);
            }
            else {
                ans = n * c;
            }
            System.out.println(ans);
        }

        sc.close();
	}
}
