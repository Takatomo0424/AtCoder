import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long T = sc.nextLong();
        sc.nextLine();

        N -= 1;

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();

        int[][] X = new int[M][2];
        for (int i = 0; i < M; i++) {
            X[i][0] = sc.nextInt();
            X[i][1] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            T = T - A[i];
            if (T <= 0) {
                System.out.println("No");
                return;
            }
            if (count < M && X[count][0] == i + 2) {
                T = T + X[count][1];
                count += 1;
            }
        }
        System.out.println("Yes");
        return;
    }
}