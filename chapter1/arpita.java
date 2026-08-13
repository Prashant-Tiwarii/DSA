package chapter1;

import java.util.*;

public class arpita {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

       

        System.out.println( check(str));
    }

    public static boolean check(String str) {

        if (str.equals("arpita lunth hai")) {
            return true;
        } 
        else if (str.equals("arpita lunth nahi hai")) {
            return false;
        } 
        else {
            return false;
        }
    }

    
}