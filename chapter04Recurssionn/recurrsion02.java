public class recurrsion02 {
    public static void main(String[] args) {
        printsum(1,5,0);
        
    }
    static void printsum(int i , int n , int sum){
        if(n==i){
            sum+= i;
            System.out.println(sum);
            return;
        }
        sum+=i;
         System.out.println(sum);
        printsum(i+1, n, sum);
        // System.out.println(sum);

    }
    
}
