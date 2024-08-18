import java.util.*;

public class p8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the diagnol : ");
        int n = scn.nextInt();
        System.out.println();
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i + j <= n + 1; j++) {
                if (i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
