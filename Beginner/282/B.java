import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int flag = 0;
                for (int k = 0; k < M; k++) {
                    if (S[i].charAt(k) == 'o' || S[j].charAt(k) == 'o')
                        flag++;
                }
                if (flag == M)
                    count++;
            }
        }
        System.out.println(count);
    }
}
