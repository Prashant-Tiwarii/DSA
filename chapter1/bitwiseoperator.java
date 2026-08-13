package chapter1;
import java.util.*;
public class bitwiseoperator {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011
        System.out.println("a & b = " + (a & b)); // 0001 = 1 AND OPERATOR
        System.out.println("a | b = " + (a | b)); // 0111 = 7 OR OPERATOR
        System.out.println("a ^ b = " + (a ^ b)); // 0110 = 6 xor OPERATOR
        System.out.println("~a = " + (~a)); // 1010 = -6  not OPERATOR
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10  LEFT SHIFT
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 = 2   RIGHT SHIFT
        System.out.println("a >>> 1 = " + (a >>> 1)); // 0010 = 2   UNSIGNED RIGHT SHIFT
    }
    
}
