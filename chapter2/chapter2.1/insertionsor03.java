
import java.util.Arrays;
public class insertionsor03 {
    


    public static void main(String args[]) {
        int[] arr = {2,4,1,3,5,3,3,64,33};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j= i+1; j>0 ; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
            
        }
    }

}
