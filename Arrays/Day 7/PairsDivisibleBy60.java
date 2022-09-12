import java.util.Arrays;
import java.util.HashMap;

class PairsDivisibleBy60 {
    public static void main(String[] args) {
        int[] time = { 30, 20, 150, 100, 40, 40, 1 };
        System.out.println(numPairsDivisibleBy60(time));
    }

    // best approach
    // public static int numPairsDivisibleBy60(int[] time) {
    // int count = 0;
    // int[] arr = new int[60];
    // Arrays.fill(arr, 0);
    // for (int i = 0; i < time.length; i++) {
    // int r = time[i] % 60;
    // if (r == 0) {
    // arr[0]++;
    // count += arr[0] - 1;
    // } else if (arr[60 - r] > 0) { // 1+59
    // count += arr[60 - r];
    // arr[r]++;
    // } else {
    // arr[r]++;
    // }
    // }
    // return count;
    // }

    public static int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        boolean[] vis = new boolean[60];
        int count = 0;
        for (int i : time) {
            memo.put((i % 60), memo.getOrDefault(i % 60, 0) + 1);
        }

        for (int i : memo.keySet()) {
            if (i == 0 || i == 30) {
                count += (((memo.get(i)) * (memo.get(i) - 1)) / 2);
                vis[i] = true;
            } else {
                if (vis[i])
                    continue;
                int req = 60 - i;
                if (memo.getOrDefault(req, 0) > 0) {
                    count += (memo.get(i) * memo.get(req));
                }
                vis[i] = true;
                vis[req] = true;
            }
        }
        return count;
    }
}