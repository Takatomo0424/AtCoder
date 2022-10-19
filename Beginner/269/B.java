import java.util.Scanner;

public class B {
    static int k = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = new String[k];
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        for (int n = 0; n < k; n++) {
            in[n] = sc.nextLine();
            int index = in[n].indexOf("#") + 1;
            if (index > 0) {
                if (A == 0)
                    A = n + 1;
                B = n + 1;
                C = index;
                index = in[n].indexOf(".", index);
                if (index > -1) {
                    D = index;
                } else {
                    D = k;
                }
            }
        }
        sc.close();

        System.out.println(A + " " + B);
        System.out.println(C + " " + D);
    }
}
