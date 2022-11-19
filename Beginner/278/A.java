import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        int[] A = new int[N];
        for (int n = 0; n < N; n++) {
            A[n] = sc.nextInt();
        }
        sc.close();

        for (int k = 0; k < K; k++) {
            int[] a = new int[N];
            for (int i = 1; i < N; i++) {
                a[i - 1] = A[i];
            }
            a[N - 1] = 0;
            A = a;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
