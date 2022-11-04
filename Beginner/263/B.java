import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] P = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            P[i] = sc.nextInt();
        }
        sc.close();

        int count = 1;
        int next = N - 2;

        while (true) {
            if (P[next] == 1)
                break;
            count += 1;
            next = P[next] - 2;
        }
        System.out.println(count);
    }
}
