import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int isprime = 0;
        System.out.println(
            "This program is used to check if a number is prime or not "
        );
        System.out.print("Enter the number :");
        int num = scn.nextInt();
        System.out.println();

        if (num == 0 || num == 1) {
            System.out.println("The number is neither prime nor composite");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = 0;
                break;
            } else {
                isprime = 1;
            }
        }
        if (isprime == 1) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is Composite");
        }
    }
}
