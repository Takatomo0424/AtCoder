import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        int center = (S.length() - 1) / 2;
        System.out.println(S.charAt(center));
    }
}
