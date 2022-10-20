import java.util.Scanner;

public class A {
    static int MAX = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < MAX; i++) {
            if (input[i] > -1) {
                count += 1;
            }
            if (i != MAX)
                for (int k = i + 1; k < MAX; k++) {
                    if (input[i] > -1 && input[i] == input[k]) {
                        input[k] = -1;
                    }
                }
        }
        System.out.println(count);
    }
}
