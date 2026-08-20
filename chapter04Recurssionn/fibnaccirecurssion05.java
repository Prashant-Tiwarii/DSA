

public class fibnaccirecurssion05 {
    public static void main(String[] args) {
        printfib(0, 1 , 10);
    }
    static void printfib(int i , int j ,int k){
        if(k==0){
            return;
        }
        System.out.print(i+ " ");
        printfib(j , j+i , k-1);

    }
}
//  kth fibp number
//  static int printfib(int k){
//         if(k<2){
//             return  n;
//         }
//         return (k-1) + (k-2);
//        
//alway bigger function is called till last then smaller starts executing

//                          printfib(5)
//                        /             \
//                 printfib(4)        printfib(3)
//                 /       \           /       \
//           printfib(3) printfib(2) printfib(2) printfib(1)
//            /    \       /   \       /   \
//       printfib(2) printfib(1) 1    0   1    1
//        /    \
//   printfib(1) printfib(0)
//       1           0