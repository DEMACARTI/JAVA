import java.util.*;

public class p6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of the diamond :");
        int n = scn.nextInt();
        System.out.println();
        int st = n / 2;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= st; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= st; k++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
        }
    }
}
