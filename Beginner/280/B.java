import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        int[] A = new int[N];

        S[0] = sc.nextInt();
        A[0] = S[0];
        System.out.print(S[0] + " ");
        for (int i = 1; i < N; i++) {
            S[i] = sc.nextInt();
            int temp = 0;
            for (int j = 0; j < N - 1; j++) {
                temp += A[j];
            }
            int result = S[i] - temp;
            A[i] = result;
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
}
