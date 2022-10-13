import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String hex = Integer.toHexString(N);
        hex = hex.toUpperCase();
        if(N < 16){
            System.out.println(0 + hex);
        }else{
            System.out.println(hex);
        }
        sc.close();
    }
}