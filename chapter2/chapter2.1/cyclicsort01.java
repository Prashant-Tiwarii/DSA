import java.util.Arrays;

public class cyclicsort01 {
    public static void main(String args[]) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            if(arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }
}