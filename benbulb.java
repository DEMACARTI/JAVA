import java.util.*;

public class benbulb {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of bulbs : ");
        int n = scn.nextInt();
        System.out.println();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
