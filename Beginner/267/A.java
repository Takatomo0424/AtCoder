import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        int last;
        switch (S) {
            case "Monday":
                last = 5;
                break;
            case "Tuesday":
                last = 4;
                break;
            case "Wednesday":
                last = 3;
                break;
            case "Thursday":
                last = 2;
                break;
            case "Friday":
                last = 1;
                break;
            default:
                last = -1;
                break;
        }
        System.out.println(last);
    }
}
