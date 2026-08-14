

public class rleetcode1672 {
    public static void main(String args[]){
        int [][] arr = {
                    { 1,2,3},
                    {2,5},
                    {3,4,51}
        };
        System.out.println(Richest(arr));
    }
    static int Richest(int [][] arr){
        int max=0;
        for(int i =0;i< arr.length; i++){
            int rowsum =0;
            for(int j = 0 ; j<arr[i].length;j++){
                rowsum  = rowsum + arr[i][j];
            }
            if(rowsum>max){
                max = rowsum;
            }
        }
        return max;

    }
    
}
