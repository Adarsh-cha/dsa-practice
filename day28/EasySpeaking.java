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
            
            int cons = 0;
            boolean flag = false;
            
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                    cons = 0;
                }
                else {
                    cons++;
                }
                
                if (cons >= 4) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

        sc.close();
	}
}
