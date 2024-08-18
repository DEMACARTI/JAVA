import java.util.*;

public class hcf {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int n1 = scn.nextInt();
        System.out.println();
        System.out.print("Enter the 2nd number : ");
        int n2 = scn.nextInt();
        System.out.println();
        int min = n1;
        if (n1 > n2) {
            min = n2;
        }
        int temphcf = 1;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                temphcf = i;
            }
        }
        System.out.println("HCF is :" + temphcf);
        System.out.println("LCM is :" + (n1 * n2) / temphcf);
    }
}
