

public class sumofsubarray {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int k = 2;

        int max = calculate(arr, k);

        System.out.println(max);
    }

    static int calculate(int[] arr, int k) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        max = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}