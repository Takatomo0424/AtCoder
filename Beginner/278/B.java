import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        while (true) {
            int h = (H / 10) * 10 + (M / 10);
            int m = (H % 10) * 10 + (M % 10);
            if (h < 24 & m < 60) {
                if (M < 10) {
                    System.out.println(H + " 0" + M);
                } else {
                    System.out.println(H + " " + M);
                }
                break;
            }
            M += 1;
            if (M > 59) {
                M = 0;
                H += 1;
                if (H > 23)
                    H = 0;
            }

        }
    }
}