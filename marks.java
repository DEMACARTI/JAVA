import java.util.*;

public class marks {

    public static void main(String[] args) {
        // creating a scanner class for asking marks of the student
        Scanner scn = new Scanner(System.in);
        // asking for marks from the user
        System.out.println("Please tell the marks out of 100 ");
        System.out.print("Kripya apne physics ke marks batayein : ");
        float phy = scn.nextInt();
        System.out.println();
        System.out.print("Kripya apne maths ke marks batayein : ");
        float math = scn.nextInt();
        System.out.println();
        System.out.print("Kripya apne chemistry ke marks batayein : ");
        float chem = scn.nextInt();
        System.out.println();

        float avg = (phy + math + chem) / 3;

        if (avg >= 90) {
            System.out.println("Excellent !!!");
        } else if (avg >= 80 && avg <= 90) {
            System.out.println("Good");
        } else if (avg >= 70 && avg <= 80) {
            System.out.println("Fair");
        } else if (avg >= 60 && avg <= 70) {
            System.out.println("Meets expectations !!!");
        } else {
            System.out.println("Bhai kya kar rha h yaar tu ");
        }
        System.out.println("Your percentage in 12th is : " + avg + "%");
    }
}
