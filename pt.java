import java.util.*;

public class pt {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = scn.nextInt();
        System.out.println();
        System.out.print("Enter the second number : ");
        int n2 = scn.nextInt();
        System.out.println();
        System.out.print("Enter the third number : ");
        int n3 = scn.nextInt();
        System.out.println();
        boolean trip;
        int small;
        int secsmall;
        int max = 0;
        if (n1 > n2 && n2 > n3) {
            max = n1;
            small = n2;
            secsmall = n3;
        } else if (n2 > n1 && n1 > n3) {
            max = n2;
            small = n1;
            secsmall = n3;
        } else {
            max = n3;
            small = n2;
            secsmall = n1;
        }
        if ((secsmall * secsmall) + (small * small) == (max * max)) {
            trip = true;
        } else {
            trip = false;
        }
        System.out.println(trip);
    }
}
