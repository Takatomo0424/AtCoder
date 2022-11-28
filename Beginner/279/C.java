import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        List<String> S = new ArrayList<>();
        List<String> T = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            S.add(sc.next());
        }
        for (int i = 0; i < H; i++) {
            T.add(sc.next());
        }
        sc.close();

        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();
        for (int i = 0; i < W; i++) {
            StringBuilder sBuf = new StringBuilder();
            StringBuilder tBuf = new StringBuilder();
            for (int j = 0; j < H; j++) {
                String SBuf = S.get(j);
                sBuf.append(SBuf.charAt(i));
                String TBuf = T.get(j);
                tBuf.append(TBuf.charAt(i));
            }
            s.add(sBuf.toString());
            t.add(tBuf.toString());
        }

        Collections.sort(s);
        Collections.sort(t);
        for (int i = 0; i < W; i++) {
            if (!t.get(i).equals(s.get(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
