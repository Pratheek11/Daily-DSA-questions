import java.util.Arrays;

class MinimizeTheHeightsTwo {
    public static void main(String[] args) {

    }

    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int diff = a[n - 1] - a[0];
        int least = a[0] + k, most = a[n - 1] - k, mini, maxi;
        for (int i = 0; i < n - 1; i++) {
            mini = Math.min(a[i + 1] - k, least);
            maxi = Math.max(a[i] + k, most);
            if (mini < 0)
                continue;
            else
                diff = Math.min(diff, maxi - mini);
        }
        return diff;
    }

}