public class QuickLeftRotation {
    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5, 6 };
        leftRotate(arr, 13, 6);
    }

    static void leftRotate(long arr[], int k, int n) {
        if (k > n) {
            k = k % n;
        }
        int j = 0;
        long[] tmp = new long[arr.length];
        for (int i = k; i < tmp.length; i++) {
            tmp[j++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            tmp[j++] = arr[i];
        }
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = tmp[i];
        }
    }
}
