import java.util.*;
 
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
 
        while (tc-- > 0) {
            int n = sc.nextInt();
 
            int min = 1;
            int max = n * 3;
 
            for (int i = 0; i < n; i++) {
                System.out.print(min++ + " " + max-- + " " + max-- + " ");
            }
 
            System.out.println();
        }
    }
}
