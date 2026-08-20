public class twopointer011 {
    public static void main(String[] args) {
        int[] arr= {2,5,7,8,45};
       int min = difference(arr);
        System.out.println(min);
        
    }
    static int difference(int[] arr){
       
        int min = Integer.MAX_VALUE;
        int diff=0;
        
          for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
           diff  =arr[j]-arr[i];
           if(min>diff){
            min =diff;
           }
        }
        return min;
    }
}
       