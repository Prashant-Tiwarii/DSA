package chapter1;

public class array01 {
    public static void main( String[] args) {
//         int n = 5;
//        // int [] arr = new int[n];
//        // int[] arr  = {1,2,3,4,5}
// int ros[]; //declaration
// ros = new int[5]; //initialise
//     }
//}
// 1.array object are in heap memory
// 2.heap memory is used for dynamic memory allocation
// 3.heap objectts are not continuous in memory
// 4.array object in java may not be continuous in memory , it depend on jvm.
//new is used to create array object in heap memory.
String[] str = new String[5]; //declaration and initialization
//System.out.println(str[0]); //null
str[0] = "hello";
System.out.println(str[0]); //hello
}
}
