public class MissingNumber {
    public static void main(String[] args) {
        int[] A = { 1, 4, 3 };
        System.out.println(missingNumber(A, 4));
    }

    public static int missingNumber(int A[], int N) {
        // Your code goes here
        int[] arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            arr[A[i]] = 1;
        }
        for (int i = 1; i <= N; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return N + 1;
    }
}
