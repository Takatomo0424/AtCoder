import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[][] L = new int[N][];
        for(int i = 0; i < N; i++){
            int l = sc.nextInt();
          L[i] = new int[l];
            for(int k = 0; k < l; k++){
                L[i][k] = sc.nextInt();             
            }
          
        }
      
        for(int i = 0; i < Q; i++){
            int Sq = sc.nextInt();
            int Tq = sc.nextInt();
            System.out.println(L[Sq-1][Tq-1]);
        }
      
        sc.close();
    }
}