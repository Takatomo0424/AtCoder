import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int N = -1;
        sc.close();

        switch (Y % 4) {
            case 0:
                N = 2;
                break;
            case 1:
                N = 1;
                break;
            case 2:
                N = 0;
                break;
            case 3:
                N = 3;
                break;
            default:
                break;
        }
        System.out.println(Y + N);
    }
}
