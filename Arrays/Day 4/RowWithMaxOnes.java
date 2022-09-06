public class RowWithMaxOnes {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0 }, { 1, 1 } };
        System.out.println(rowWithMax1s(arr, 2, 2));
    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i = 0, j = m - 1, ans = -1;
        while (i < n && j >= 0) {
            if (arr[i][j] == 1) {
                j--;
                ans = i;
            } else if (arr[i][j] == 0) {
                i++;
            }
        }
        return ans;
    }
}
