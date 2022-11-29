import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            list.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            list.get(A).add(B);
            list.get(B).add(A);
        }
        sc.close();

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
            int size = list.get(i).size();
            System.out.print(size);
            for (int j = 0; j < size; j++) {
                System.out.print(" " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
