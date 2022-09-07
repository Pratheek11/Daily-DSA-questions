import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
        // Another approach sorting
    }

    public static int longestConsecutive(int[] nums) {
        int max = 0, count = 0;
        HashSet<Integer> ans = new HashSet<>();
        for (int i : nums) {
            ans.add(i);
        }
        for (int i : nums) {
            count = 0;
            if (ans.contains(i - 1)) {
                continue;
            } else {
                while (ans.contains(i)) {
                    i++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
