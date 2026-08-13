package chapter1;
import java.util.*;
public class twoDarray04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
      //  System.out.println(Arrays.deepToString(arr)); // to print 2D array in one line
        for(int [] row : arr){ 
            System.out.println(Arrays.toString(row)); // to print each row of 2D array in one line
            System.out.println(); // to print new line after each row
        }
        // System.out.println( arr.length); // to print number of rows
        // System.out.println( arr[0].length); // to print number of columns}

    }
}
    

