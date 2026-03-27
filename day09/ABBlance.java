
import java.util.*;

public class ABBlance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            
            int n = s.length();

            int ab = 0;
            int ba = 0;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == 'a' && s.charAt(i) == 'b') {
                    if (ab > 0) {
                        ab--;
                    }
                    else {
                        ab++;
                    }
                }
                else if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                    if (ba > 0) {
                        ba--;
                    }
                    else {
                        ba++;
                    }
                }
            }

            StringBuilder sb = new StringBuilder(s);
            if (ab == ba) {
                System.out.println(s);
            }
            else {
                sb.setCharAt(sb.length() -1 , (sb.charAt(sb.length() - 1)) == 'a' ? 'b' : 'a' );
                System.out.println(sb.toString());
            }
        }
    }
}
