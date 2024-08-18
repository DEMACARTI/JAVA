import java.util.*;

public class fibo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // printing fibonacci series
        System.out.print(
            "Enter the number till which you want the fibonacci series : "
        );
        int n = scn.nextInt();
        System.out.println();

        int curr = 1;
        int prev = 0;
        int prev2;
        for (int i = 0; i <= n; i++) {
            System.out.println(curr);
            prev2 = prev;
            prev = curr;
            curr = prev + prev2;

    }
}
