import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        String st = "atcoder";

        for (int i = L; i <= R; i++) {
            System.out.print(st.charAt(i - 1));
        }
    }
}
