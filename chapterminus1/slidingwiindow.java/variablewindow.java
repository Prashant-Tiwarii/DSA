public class variablewindow{
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int ans = longestSubarray(arr, k);

        System.out.println(ans);
    }

    static int longestSubarray(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int maxLength = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];

            while (sum > k) {
                sum = sum - arr[start];
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}