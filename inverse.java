import java.util.*;

public class inverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n = scn.nextInt();
        System.out.println();
        int count = 0;
        int ip;
        int id = 0;
        while (n != 0) {
            count++; // Original place
            ip = n % 10; // Inverse place
            id += count * (int) Math.pow(10, ip - 1); // Inverse digit
            n /= 10;
        }
        int coun = 0;
        int x = id;
        while (x != 0) {
            x /= 10;
            coun++;
        }
        int r = id;
        while (coun != 0) {
            int divs = (int) Math.pow(10, --coun);
            int q = r / divs; // stores the quotient after dividing by power of 10
            r %= divs;
            System.out.println(q);
        }
    }
}
