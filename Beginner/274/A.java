import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        sc.close();
        double result = (double) Math.round(B / A * 1000) / 1000;
        System.out.println(String.format("%.3f", result));
    }
}
