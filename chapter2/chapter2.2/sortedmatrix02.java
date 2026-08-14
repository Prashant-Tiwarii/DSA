public class sortedmatrix02 {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int target = 10;

        int[] ans = search(arr, target);

        System.out.println("Row: " + ans[0]);
        System.out.println("Column: " + ans[1]);
    }

    static int[] search(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Convert 1D index into row and column
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return new int[]{row, col};
            }

            if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}