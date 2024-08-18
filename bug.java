import java.util.*;

public class bug {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a number you want : ");
        int x = Integer.parseInt(scn.nextLine());
        System.out.println("\n");
        System.out.print("Input your name : ");
        String name = scn.nextLine();
        System.out.println("\n");
        System.out.println(
            "Hello Monsieur " + name + " here is your number :" + x
        );
    }
}
