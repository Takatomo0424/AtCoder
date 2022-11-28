import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        Set<String> map = new HashSet<String>();
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (T == 1) {
                map.add(A + "," + B);
            } else if (T == 2) {
                map.remove(A + "," + B);
            } else if (T == 3) {
                if (map.contains(A + "," + B) && map.contains(B + "," + A)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
