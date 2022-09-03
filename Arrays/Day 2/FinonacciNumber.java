
public class FinonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(25));
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
