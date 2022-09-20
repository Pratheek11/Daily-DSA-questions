import java.util.*;

public class LargetSubarrayWithZeroSum {
    int maxLen(int arr[], int n) {
        // Your code here
        int curSum = 0;
        int largest = 0;
        HashMap<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if (curSum == 0) {
                largest = i + 1;
            } else {
                if (memo.get(curSum) != null) {
                    largest = Math.max(largest, i - memo.get(curSum));
                } else {
                    memo.put(curSum, i);
                }
            }
        }
        return largest;
    }
}
