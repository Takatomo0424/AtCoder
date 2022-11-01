import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int result = Math.max(Math.abs(R - 8), Math.abs(C - 8));
        if (result % 2 > 0) {
            System.out.println("black");
        } else {
            System.out.println("white");
        }
    }
}
