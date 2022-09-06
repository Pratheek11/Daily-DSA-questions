import java.util.HashMap;

public class LongestSuarrayWithKsum {
    public static void main(String[] args) {
        int[] A = { -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6 };
        System.out.println(lenOfLongSubarr(A, 17, 15));
    }

    public static int lenOfLongSubarr(int arr[], int n, int k) {
        // Complete the function
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                max = Math.max(max, i + 1);
            }
            if (hm.containsKey(sum - k)) {
                max = Math.max(max, i - hm.get(sum - k));
            }
            hm.put(sum, hm.getOrDefault(sum, i));
        }
        return max;
    }
}
