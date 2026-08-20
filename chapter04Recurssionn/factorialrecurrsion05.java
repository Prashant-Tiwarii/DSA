public class factorialrecurrsion05 {
    public static void main(String args[]) {
        int ans = printfactorial(5);
        System.out.println(ans);
    }

    static int printfactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * printfactorial(n - 1);
    }
}
// 5 * printfactorial(4)
//         ↓
// 5 * 4 * printfactorial(3)
//             ↓
// 5 * 4 * 3 * printfactorial(2)
//                 ↓
// 5 * 4 * 3 * 2 * printfactorial(1)
//                     ↓
// 5 * 4 * 3 * 2 * 1