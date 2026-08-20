import java.util.Arrays;

public class selectionsort02 {
    public static void main(String args[]) {
        int[] arr = {2,4,1,3,5,3,3,64,33};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}