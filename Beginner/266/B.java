import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long standard = 998244353;

        long X = (standard + N % standard) % standard;
        System.out.println(X);
    }
}
