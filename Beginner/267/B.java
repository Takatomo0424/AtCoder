import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");
        sc.close();

        if (S[0].equals("1")) {
            System.out.println("No");
            return;
        }

        int[] s = new int[7];
        s[0] = Integer.parseInt(S[6]);
        s[1] = Integer.parseInt(S[3]);
        s[2] = Integer.parseInt(S[1]) | Integer.parseInt(S[7]);
        s[3] = Integer.parseInt(S[0]) | Integer.parseInt(S[4]);
        s[4] = Integer.parseInt(S[2]) | Integer.parseInt(S[8]);
        s[5] = Integer.parseInt(S[5]);
        s[6] = Integer.parseInt(S[9]);

        for (int k = 0; k < 7; k++) {
            System.out.print(s[k]);
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            if (s[i] > 0 && s[i + 1] < 1) {
                for (int k = ++i; k < 7; k++) {
                    if (s[k] > 0) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
        return;
    }
}
