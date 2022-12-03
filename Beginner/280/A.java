import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int count = 0;
        for (int i = 0; i < H; i++) {
            String S = sc.next();
            for (int j = 0; j < W; j++) {
                if (S.charAt(j) == '#')
                    count += 1;
            }
        }
        sc.close();
        System.out.println(count);
    }
}