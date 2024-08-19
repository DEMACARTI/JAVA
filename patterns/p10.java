import java.util.*;

public class p10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base for right angle triangle : ");
        int n = scn.nextInt();
        System.out.println();
        int insp = -1;
        int otsp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= otsp; j++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for (int j = 1; j <= insp; j++) {
                System.out.print("  ");
            }
            if (i > 1 && i < n) {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= n / 2) {
                otsp--;
                insp += 2;
            } else {
                otsp++;
                insp -= 2;
            }
        }
    }
}
