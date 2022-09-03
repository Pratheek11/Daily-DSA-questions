public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        System.out.println(arraySortedOrNot(arr, 4));
    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
