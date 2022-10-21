import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");
        String[] T = sc.nextLine().split("");
        sc.close();

        for (int i = 0; i < S.length; i++) {
            if (T.length - 1 < i || !(S[i].equals(T[i]))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
