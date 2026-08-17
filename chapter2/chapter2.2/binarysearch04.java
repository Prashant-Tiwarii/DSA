import java.util.*;

public class binarysearch04 {

    public static void main(String args[]) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
                
            }
        }

        // start points to the smallest element >= target
        if (start < arr.length) {
            return arr[start];
        }

        return -1;
    }
}