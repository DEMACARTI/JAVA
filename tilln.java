import java.util.*;

public class tilln {

    public static void main(String[] args) {
        // printing all the prime numbers between n1 and n2 and taking input from the user of n1 and n2
        int prime;
        Scanner scn = new Scanner(System.in);
        System.out.println(
            "This program will tell you all the prime numbers till n :)"
        );
        System.out.print("Enter the number till which you want prime no. : ");
        int n = scn.nextInt();
        System.out.println();
        int count = 0;
        int curr = 2;
        for (int j = curr; j < n; j++) {
            boolean isprime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                count++;
                System.out.println(j);
            }
        }
        System.out.println("The total number of primes are : " + count);
    }
}
