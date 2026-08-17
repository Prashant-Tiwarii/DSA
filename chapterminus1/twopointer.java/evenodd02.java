import java.util.*;

public class evenodd02{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Sortzeroandone(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sortzeroandone(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int scheck= arr[start]%2;
            int  echeck=arr[end]%2;
            if(scheck ==1 && echeck ==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(scheck==0&&echeck==0){
                start++;
            }
            else if(scheck == 1&&echeck==1){
               end--;
            }
            else{
                start++;
                end--;
            }
        }
    }
}