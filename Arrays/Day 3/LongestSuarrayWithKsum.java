public class LongestSuarrayWithKsum {
    public static void main(String[] args) {
        int[] A = { -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6 };
        System.out.println(lenOfLongSubarr(A, 17, 15));
    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        int s = 0, cur = 0, max = 0;
        for (int i = 0; i < N; i++) {
            cur += A[i];

            if (cur > K) {
                while (cur > K) {
                    if (A[s] > 0)
                        cur -= A[s];
                    if (A[s] <= 0)
                        cur += A[s];
                    s++;
                }
            }
            if (cur == K) {
                max = Math.max(max, i - s + 1);
            }
        }
        return max;
    }
}
