package chapter1;
import java.util.*;
public class maxitem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }  
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("The maximum item in the array is: " + max);
    }t
}
