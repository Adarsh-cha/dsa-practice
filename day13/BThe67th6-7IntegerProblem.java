import java.util.*;
 
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
 
        while (tc-- > 0) {
 
            int[] a = new int[7];
            int ans = 0;
            int max  = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
            }
 
            for (int i = 0; i < 7; i++) {
                if (max != a[i]) {
                    ans -= a[i];
                }
                else {
                    ans += a[i];
                    max = 0;
                }
            }
            System.out.println(ans);
        }
    }
}