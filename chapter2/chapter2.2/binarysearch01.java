import java.util.*;

public class binarysearch01 {
    public static void main(String[] args) {
        int[][] matrix = {
                          { 10,20,30,40  },
                          {15,225,35,45},
                          { 28,29,37,50},
                          { 33,34,38, 50}
        };
        int target =37;
        System.out.println(Arrays.toString(search(matrix, target)));

        
    }
    static int[] search(int [][] matrix , int target){
        int r=0;
        int c =matrix.length - 1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
