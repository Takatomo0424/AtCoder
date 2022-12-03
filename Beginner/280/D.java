import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        sc.close();

        for (int i = 1; i <= Math.sqrt(K); i += 2) {
            if (K % i == 0) {
                long count = 1;
                while (true) {
                    if (kaijo(count) % K == 0) {
                        System.out.println(count);
                        return;
                    }
                    count += 1;
                }
            }
        }
        System.out.println(K);
    }

    public static long kaijo(long n) {
        if (n == 0)
            return 1;
        return n * kaijo(n - 1);
    }
}
