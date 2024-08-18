import java.util.*;

public class rotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n = scn.nextInt();
        System.out.println();
        System.out.print("Enter the rotations : ");
        int k = scn.nextInt();
        System.out.println();
        int count = 0;
        int x = n;
        int test = 0;
        while (x != 0) {
            x /= 10;
            count++;
            test++;
        }
        long r = 0;
        while (k < 0) {
            k += count;
            test++;
        }
        for (int i = 0; i < k; i++) {
            if (k % count == 0) break;
            r = n % 10;
            n /= 10;
            n += r * (double) Math.pow(10, count - 1);
            test++;
        }
        System.out.println("This is output number :" + n + " " + test);
    }
}
