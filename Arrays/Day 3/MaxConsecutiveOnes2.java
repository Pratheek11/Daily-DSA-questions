public class MaxConsecutiveOnes2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 1 };
        System.out.println(findZeroes(arr, 9, 2));
    }

    static int findZeroes(int arr[], int n, int m) {
        // code here
        int s = 0, max = 0, cur = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                cur++;
            while (cur > m) {
                if (arr[s] == 0)
                    cur--;
                s++;
            }
            max = Math.max(max, i - s + 1);
        }
        return max;
    }
}
