import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int N = sc.nextInt();

        sc.close();
        if (X <= Y / 3) {
            System.out.println(N * X);
        } else {
            int a = N / 3;
            int b = N % 3;
            System.out.println(a * Y + b * X);
        }
    }
}
