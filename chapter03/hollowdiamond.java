import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;

public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0;i<n ;i++){
           
            for(int k =0; k<n-i;k++){
                System.out.print("*");
            }
             for(int j =0; j<i;j++){
                System.out.print(" ");
            }
            for(int j =0; j<i;j++){
                System.out.print(" ");
            }
             for(int k =0; k<n-i;k++){
                System.out.print("*");
            }
              System.out.println();
        }
        for(int i =0; i<n ; i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=n-i-2;k>=0;k--){
                System.out.print(" ");
            }
             for(int k=n-i-2;k>=0;k--){
                System.out.print(" ");
            }
            
             for(int j =0;j<=i;j++){
                System.out.print("*");
            }
           
          
            
            System.out.println(" ");
        }
          
       
            }
        }
        
    

