import java.util.*;

public class dig {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n = scn.nextInt();
        System.out.println();
        int count = 0;
        int x = n;
        while (x != 0) {
            x /= 10;
            count++;
        }
        int r = n;
        while (count != 0) {
            int divs = (int) Math.pow(10, --count);
            int q = r / divs; // stores the quotient after dividing by power of 10
            r %= divs;
            System.out.println(q);
        }
    }
}
