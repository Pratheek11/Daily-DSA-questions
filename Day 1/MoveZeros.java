// https://leetcode.com/problems/move-zeroes/

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] == 0) {
                if (arr[j] != 0) {
                    arr[i] = arr[j];
                    arr[j] = 0;
                    i++;
                }
            } else {
                i++;
            }
        }
    }
}
