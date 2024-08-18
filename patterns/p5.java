import java.util.*;

public class p5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base for right angle triangle : ");
        int n = scn.nextInt();
        System.out.println();
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= n / 2) {
                st += 2;
                sp--;
            } else {
                sp++;
                st -= 2;
            }
        }
    }
}
