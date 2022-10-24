import java.util.Scanner;;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        int[] result = new int[W];
        for (int a = 0; a < W; a++) {
            result[a] = 0;
        }

        for (int i = 0; i < H; i++) {
            String[] buf = sc.nextLine().split("");
            for (int k = 0; k < W; k++) {
                if (buf[k].equals("#"))
                    result[k] += 1;
            }
        }

        for (int c = 0; c < W; c++) {
            System.out.print(result[c] + " ");
        }
        sc.close();
    }
}
