public class Pivotelement {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int ans = searchelement(arr, target);

        System.out.println(ans);
    }

    static int searchpivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid - 1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Search in left side
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }

            // Search in right side
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int searchelement(int[] arr, int target) {

        int pivot = searchpivot(arr);

        // Array is not rotated
        if (pivot == -1) {
            return binarysearch(arr, target, 0, arr.length - 1);
        }

        // Target itself is pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // Target is in left sorted part
        if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        }

        // Target is in right sorted part
        else {
            return binarysearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

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