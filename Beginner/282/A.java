import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();
        for (int i = 0; i < K; i++) {
            System.out.print((char) ('A' + i));
        }
    }
}
