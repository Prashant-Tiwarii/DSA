package chapter0;

public class Varargs07 {
    // static void fun(int a, int b, String ...v) //
        int sum = 0;
        System.out.println("Number of arguments: " + v.length);
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
            
        }
        System.out.println("Sum of arguments: " + sum);
        System.out.println();
    }
    static void fun(int ...v) {
        int sum = 0;
        System.out.println("Number of arguments: " + v.length);
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
            
        }
        System.out.println("Sum of arguments: " + sum);
        System.out.println();
    }

    public static void main(String args[]) {
        fun(1, 2);
        fun(1, 2, 3);
        fun(1, 2, 3, 4);
    }
    
}
