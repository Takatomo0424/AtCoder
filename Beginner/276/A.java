import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IN = sc.nextLine();
        sc.close();
        String[] data = IN.split("");

        int flag = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals("a"))
                flag = i + 1;
        }
        System.out.println(flag);
    }
}
