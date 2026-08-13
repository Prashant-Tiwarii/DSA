package chapter0;

public class Shadowing06 {
    static int x = 40;
    public static void main(String args[]) {
        int x = 20;
        System.out.println(x);
        System.out.println(Shadowing06.x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }

}
