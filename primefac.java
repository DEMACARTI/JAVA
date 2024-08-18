import java.lang.Math;
import java.util.*;

public class primefac {

    public static void main(String[] args) {
        int prime;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scn.nextInt();
        System.out.println();
        int i = 2;
        int isprime = 1;
        while (n != 1) {
            if (n % i == 0 && isprime == 1) {
                n /= i;
                System.out.print(i + " x ");
            } else {
                isprime = 1;
                i++;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isprime = 0;
                        break;
                    }
                }
            }
        }
        System.out.println("1");
    }
}
