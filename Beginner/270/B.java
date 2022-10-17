import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        sc.close();

        if (reachable(X, Y) > 0) {
            System.out.println(Math.abs(X));
            return;
        }

        if (reachable(Z, Y) < 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(Math.abs(Z) + Math.abs(X - Z));
        return;
    }

    public static int reachable(int A, int B) {
        if ((A - B < 0 && 0 < B) ||
                (A - B > 0 && 0 > B) ||
                (A - B > A && 0 > B && A > 0) ||
                (A - B < A && 0 < B && A < 0)) {
            return 1;
        }
        return -1;
    }
}
