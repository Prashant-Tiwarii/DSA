
public class tablerecurssion03 {
    public static void main(String args[]){
        printtable(5,10 );
        printtable(5,1 );

        }
static void printtable(int n , int m){
    // if(m==0){
    //     return;
    // }
   if(m>10){
    return;
   }
   System.out.println(n +" * "+ m+ " = "+ n*m);
    //printtable(n, m-1);  
    printtable(n, m+1); 
       System.out.println(n +" * "+ m+ " = "+ n*m);
} 
    }
    

