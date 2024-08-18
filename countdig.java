import java.util.*;

public class countdig {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input : ");
        long n = scn.nextInt();
        System.out.println();
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
