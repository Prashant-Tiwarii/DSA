public class cyclic{
    public static void main(String args[]){
        int[] arr={3,5,2,1,2};
        sort(arr);
    }

    static void sort(int[] arr){
        int i=0;

        while(i<arr.length){
            int correctIndex=arr[i]-1;

            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }

        for(int k=0;k<arr.length;k++){
            if(arr[k]!=k+1){
                System.out.println("Missing: "+(k+1));
                System.out.println("Duplicate: "+arr[k]);
            }
        }
    }
}