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
            int r = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println(r + (Math.max(0, y - r) / 2));
        }
	}
}
