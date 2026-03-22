
import java.util.*;

public class FlipFlops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] <= c) {
                    int use = Math.min(k, c - a[i]);
                    c += a[i] + use;
                    k -= use;
                }
                else {
                    break;
                }
            }
            System.out.println(c);
        }
    }
}