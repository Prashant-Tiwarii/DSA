import java.util.*;
public class rectangle01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of coloum");
        int m= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
