import java.util.*;

public class PassingtheBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
