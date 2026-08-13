package chapter1;

import java.util.*;

public class array02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(" " + arr[i]);
        // }
        // for(int num : arr){ // for each loop- for every element in the array, it will assign the value to num and print it
        //     System.out.print(" " + num); // here num represent element of the aarrsy
        // }
        System.out.println(Arrays.toString(arr)); // to print array in one line
    }
}73.5
