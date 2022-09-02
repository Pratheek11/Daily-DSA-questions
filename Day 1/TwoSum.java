import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 14 };
        System.out.println(twoSum(nums, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!memo.containsKey(nums[i])) {
                memo.put(nums[i], i);
            }
            if (memo.containsKey(target - nums[i])) {
                if (memo.get(target - nums[i]) != i) {
                    return new int[] { i, memo.get(target - nums[i]) };
                }
            }
        }

        return new int[2];
    }
}
