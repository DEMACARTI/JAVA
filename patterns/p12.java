import java.util.*;

public class p12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base length : ");
        int n = scn.nextInt();
        System.out.println();
        int prev = 0;
        int prev2 = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(prev + " ");
                int curr = prev + prev2;
                prev2 = prev;
                prev = curr;
            }
            System.out.println();
        }
    }
}
