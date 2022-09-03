// https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/

public class DuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2 };
        System.out.println(remove_duplicate(arr, 4));
    }

    static int remove_duplicate(int arr[], int N) {
        // code here
        int i = 0;
        for (int j = 1; j < N; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
