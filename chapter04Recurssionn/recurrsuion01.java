import java.util.*;
public class recurrsuion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }
    static void printnum(int n ){
        int i =1;
        if(n==0){
           
            return;
        }
        System.out.println(n);
        i++;
        printnum(n-1);
        //  System.out.println(n); this will print from 1 to 5

    }
}
