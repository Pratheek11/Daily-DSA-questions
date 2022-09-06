public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = { 7, -1, 2, 1, -4 };
        System.out.println(maxSubarraySum(arr, 5));
    }

    public static long maxSubarraySum(int arr[], int n) {
        // Your code here
        int max = Integer.MIN_VALUE, cur = 0;
        for (int i = 0; i < n; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            if (cur < 0)
                cur = 0;
        }
        return max;
    }
}
