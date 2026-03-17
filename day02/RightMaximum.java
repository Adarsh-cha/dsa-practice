
import java.util.*;

public class RightMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] tem = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i > 0 && max <= a[i]) {
                    tem[i] = 1;
                    max = a[i];
                }

                if (i == 0) {
                    tem[i] = 1;
                    max = a[i];
                }
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (tem[i] != 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
