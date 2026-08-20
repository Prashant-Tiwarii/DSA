import java.util.Arrays;

public class prefixsum{
    public static void main(String args[]){
        int[] arr = {5,5,5};
        int x= 4;
        for(int i =0; i<arr.length; i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
            System.out.print(arr[i] + " + ");
            }
        }
        System.out.println();
        sumprefix(arr);
        

    }
    static void sumprefix(int[] arr ){
        int[] arr1 = new int[arr.length];
        arr1[0]= arr[0];
        for(int i =1; i<arr.length;i++){
            arr1[i] = arr[i]+arr1[i-1];
        }
        System.out.println(arr1[arr.length-1]);
    }
}