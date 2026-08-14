import java.util.*;

public class bianrysearinarray03 {
    public static void main(String args[]){
        int [] arr = {12,23,34,45,56,67,78,98,655};
        int target = 98;
        System.out.println(Search(arr ,target));
    }
    static int Search(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;
       int mid =start + (end-start)/2;
        while(start<=end){
             mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;

            }
            if(arr[mid] >target   ){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return mid;
    }
    
}
