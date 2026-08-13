package chapter0;

import java.util.Scanner;

public class switchcheck04 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        switch (str) {
            case "Monday":
                System.out.println("first day of week");
                break;

            case "Tuesday":
                System.out.println("second day of week");
                break;

            case "Wednesday":
                System.out.println("third day of week");
                break;

            case "Thursday":
                System.out.println("fourth day of week");
              

            case "Friday":
                System.out.println("fifth day of week");
              

            case "Saturday":
                System.out.println("sixth day of week");
                break;

            case "Sunday":
                System.out.println("seventh day of week");
                break;

            default:
                System.out.println("invalid day");
        }
    }
}