public class infinitearray {

    public static void main(String args[]) {

        int[] arr = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 11,
            12, 13, 44, 55, 66, 77, 88, 99,
            102, 133, 144, 155, 244, 544, 566,
            665, 755, 766, 877, 899, 1034, 5665
        };

        int target = 1034;

        System.out.println(Search(arr, target));
    }

    static int[] findrange(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (end < arr.length && arr[end] < target) {

            start = end;
            end = end * 2;
        }

        if (end >= arr.length) {
            end = arr.length - 1;
        }

        return new int[]{start, end};
    }

    static int Search(int[] arr, int target) {

        int[] range = findrange(arr, target);

        int start = range[0];
        int end = range[1];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}