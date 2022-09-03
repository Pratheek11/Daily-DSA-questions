public class SearchInSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        System.out.println(searchInSorted(arr, 5, 6));
    }

    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        int s = 0, e = N - 1;
        while (s <= e) {
            int mid = (e + s) / 2;
            if (arr[mid] == K)
                return 1;
            if (arr[mid] < K)
                s = mid + 1;
            if (arr[mid] > K)
                e = mid - 1;
        }
        return -1;
    }
}
