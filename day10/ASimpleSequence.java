import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}