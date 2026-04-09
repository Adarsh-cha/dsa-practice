import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int ans = n < 5 ? (n * 100) : (n * 85);
        System.out.println(ans);

        sc.close();

	}
}
