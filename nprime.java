import java.lang.Math;
import java.util.*;

public class nprime {

    public static void main(String[] args) {
        // taking input from the user for prime numbers till n
        Scanner scn = new Scanner(System.in);
        System.out.print(
            "Enter the number till which you want prime numbers of :"
        );
        int n = scn.nextInt();
        System.out.println();
        //logic
        int curr = 2;

        for (int i = curr; i <= n; i++) {
            boolean isprime = true;
            for (int j = 2; Math.sqrt(i) >= j; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                System.out.println(i);
            }
        }
    }
}
