import java.util.*;
 
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
 
        while (tc-- > 0) {
            int x = sc.nextInt();
 
            System.out.println(Math.min(67, (x + 1)));
        }
    }
}