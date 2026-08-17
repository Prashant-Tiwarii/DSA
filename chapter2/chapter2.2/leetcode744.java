public class leetcode744 {

    public static void main(String[] args) {

        char[] letters = {'a', 'b', 'c', 'd'};
        char target = 'g';

        leetcode744 obj = new leetcode744();

        System.out.println(obj.nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}