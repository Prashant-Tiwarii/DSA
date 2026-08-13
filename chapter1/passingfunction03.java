package chapter1;
import java.util.Arrays;
public class passingfunction03 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        System.out.println("Before calling the function: ");
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println("After calling the function: ");
        System.out.println(Arrays.toString(nums));
    }
    static void change(int []arr){
        arr[0] = 100;
    }
   // String are immutable in java, so if we pass string to function and change 
   // it inside the function, it will not change the original string. 
   //but array are mutable in java, so if we pass array to function and change
   //  it inside the function, it will change the original array.
}
