import java.util.*;

public class revdig {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n = scn.nextInt();
        System.out.println();
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}
