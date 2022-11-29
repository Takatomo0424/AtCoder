import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            if (map.get(A) != null)
                a = map.get(A);
            if (map.get(B) != null)
                b = map.get(B);
            a.add(B);
            b.add(A);
            map.put(A, a);
            map.put(B, b);
        }
        sc.close();

        int MAX = 1;
        Deque<Integer> next = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        next.add(MAX);
        set.add(MAX);

        while (!next.isEmpty()) {
            int temp = next.poll();
            if (map.get(temp) == null)
                continue;
            for (int x : map.get(temp)) {
                if (!set.contains(x)) {
                    set.add(x);
                    next.add(x);
                    MAX = Math.max(MAX, x);
                }
            }
        }
        System.out.println(MAX);
    }
}
