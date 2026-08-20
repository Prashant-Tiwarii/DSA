
import java.util.Arrays;

public class bubblsort04 {
    public static void main(String args[]){
        int[] arr = {2,4,1,3,5,3,3,64,33};
        bubblesort(arr);
       System.out.println(Arrays.toString(arr));
}
static int [] bubblesort(int [] arr){
    for(int i = 0 ; i <arr.length-1 ;i++){
        for(int j = 1; j<arr.length-i;j++){
            if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]= temp;
            }
        }
    }
    return arr;
}
}
