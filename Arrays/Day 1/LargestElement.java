class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 50, 90 };
        int n = arr.length;
        System.out.println(largest(arr, n));
    }

    public static int largest(int arr[], int n) {
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}