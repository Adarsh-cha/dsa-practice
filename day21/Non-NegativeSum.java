import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int ans = 0;
            int i = n - 1;
            boolean found = false;
            for (i = n - 1; i >= 0; i--) {
                if (a[i] >= 0) {
                    ans += a[i];
                }
                else {
                    if ((ans + a[i]) >= 0) {
                        ans += a[i];
                    }
                    else {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                System.out.println(n - 1 - i);
            }
            else {
                System.out.println(n);
            }
        }
	}
}
