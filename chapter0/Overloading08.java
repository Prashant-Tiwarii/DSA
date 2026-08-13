package chapter0;

public class Overloading08 {
    static void fun(int a, int b) {
        System.out.println("Inside fun(int a, int b)");
        System.out.println("Sum: " + (a + b));
        System.out.println();
    }

    static void fun(double a, double b) {
        System.out.println("Inside fun(double a, double b)");
        System.out.println("Sum: " + (a + b));
        System.out.println();
    }

    public static void main(String args[]) {
        fun(1, 2);
        fun(1.5, 2.5);
    }
    
}
