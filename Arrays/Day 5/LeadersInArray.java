import java.util.ArrayList;

class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 7, 17, 5, 2 };
        ArrayList<Integer> ans = leaders(arr, 5);
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        int[] ne = new int[n];
        int i = 0;
        int max = arr[n - 1];
        ne[i++] = max;
        for (int j = n - 2; j >= 0; j--) {
            if (arr[j] >= max) {
                max = arr[j];
                ne[i++] = max;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j = n - 1; j >= 0; j--) {
            if (ne[j] != 0) {
                ans.add(ne[j]);
            }
        }
        return ans;
    }
}