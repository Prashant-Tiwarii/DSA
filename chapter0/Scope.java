package chapter0;

public class Scope {
    public static void main(String args[]) {
        int x = 10;
        {
            int y = 20;//any thing initialised within the block then it will  range in that block only
           // int x=20; // any thiny initialised one in a method cant  be initialised again but can be changed.
            x=20;

            System.out.println(x);
            System.out.println(y);
        }
        System.out.println(x);
         //System.out.println(y); // This line would cause a compilation error because y is out of scope
    }
}
