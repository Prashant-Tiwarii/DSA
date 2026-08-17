import java.util.*;

public class Zeroandone01{
    public static void main(String args[]){
        int[] arr={1,0,1,0,1,0,1,0,1,0};
        Sortzeroandone(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sortzeroandone(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            if(arr[start]==1&&arr[end]==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[start]==1&&arr[end]==1){
                end--;
            }
            else if(arr[start]==0&&arr[end]==0){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
    }
}