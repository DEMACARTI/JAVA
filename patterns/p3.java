import java.util.*;

public class p3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base for right angle triangle : ");
        int n = scn.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i + j < n + 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
