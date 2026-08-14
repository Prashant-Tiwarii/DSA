import java.util.*;

public class minnumber03 {

    public static void main(String[] args) {

        int[] arr = {18, 13, 76, 24, 85};

        System.out.println(min(arr));
    }

    static int min(int[] arr) {

        int x = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < x) {
                x = num;
            }
        }

        return x;
    }
}