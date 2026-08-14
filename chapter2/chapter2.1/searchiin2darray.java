public class searchiin2darray {

    public static void main(String args[]) {

        int[][] arr = {
            {2, 4, 5, 3},
            {8, 90},
            {23, 63, 98}
        };

        int target = 63;

        int[] ans = Search(arr, target);

        System.out.println("Row: " + ans[0]);
        System.out.println("Column: " + ans[1]);
    }

    static int[] Search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int column = 0; column < arr[row].length; column++) {

                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }

        return new int[]{-1, -1};
    }
}