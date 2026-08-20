public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int index = 0; index <=n ; index++) {{
         
            for(int j=n; j>index;j--){
                System.out.print(" ");
            }
            for(int k =0; k<index;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        }
    }
}
