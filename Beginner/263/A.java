import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] in = new int[5];
        for (int i = 0; i < 5; i++) {
            in[i] = sc.nextInt();
        }
        sc.close();

        boolean three = false;
        boolean two = false;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            if (in[i] > 0) {
                for (int k = i + 1; k < 5; k++) {
                    if (in[i] == in[k]) {
                        count += 1;
                        in[k] = -1;
                    }
                }
                if (count == 2) {
                    three = true;
                } else if (count == 1) {
                    two = true;
                }
            }
        }

        if (three && two) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
