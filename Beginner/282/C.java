import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();

        boolean flag = false;
        for (int i = 0; i < N; i++) {
            char next = S.charAt(i);
            if (next == '"') {
                flag = !flag;
            } else if (next == ',' && !flag) {
                next = '.';
            }
            System.out.print(next);
        }
    }
}
