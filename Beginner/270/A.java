import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = 0;
        if ((A - 4 >= 0) || (B - 4 >= 0)) {
            C += 4;
        }
        A = A % 4;
        B = B % 4;
        if (A - 2 > 0 || B - 2 >= 0) {
            C += 2;
        }
        A = A % 2;
        B = B % 2;
        if (A - 1 >= 0 || B - 1 >= 0) {
            C += 1;
        }
        System.out.println(C);
        sc.close();
    }
}
