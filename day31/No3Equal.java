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
            String s = sc.next();

            int count = 0;
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i += 2;
                }
            }
            System.out.println(count);
        }

        sc.close();
	}
}
