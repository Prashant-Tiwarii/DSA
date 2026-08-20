import java.util.*;
static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int index = 0; index <=n ; index++) {{
         
        //     for(int j=0; j<n-index;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k =0; k<2*index-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
            
        // }


        //reverse pyramid
     for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int k=0;k<2*(n-i)-1;k++){
        System.out.print("*");
    }
    System.out.println();
}
}

