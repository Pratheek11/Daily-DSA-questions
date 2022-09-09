class MaximumSumInSubarray {
    public static void main(String[] args) {
        long[] arr = { 5, 4, 1, 3, 6 };
        System.out.println(pairWithMaxSum(arr, 5));
    }

    public static long pairWithMaxSum(long arr[], long N) {
        // Your code goes here
        long cur = arr[0] + arr[1];
        long max = cur;
        for (int i = 1; i < N - 1; i++) {
            cur = arr[i] + arr[i + 1];
            max = Math.max(max, cur);
        }
        return max;
    }
}