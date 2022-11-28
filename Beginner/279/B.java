import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();
        System.out.println(S.matches(".*" + T + ".*") ? "Yes" : "No");
    }
}
