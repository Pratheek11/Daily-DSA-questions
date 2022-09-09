import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {

    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length == 3)
            return nums[0] + nums[1] + nums[2];
        int res = 20000;
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + twoSumClosest(nums, i + 1, target - nums[i]);
            if (Math.abs(res) > Math.abs(sum - target)) {
                res = sum - target;
            }
        }
        return res + target;
    }

    int twoSumClosest(int[] nums, int index, int target) {
        int left = index, right = nums.length - 1;
        int res = Integer.MAX_VALUE;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return target;
            }
            if (Math.abs(res) > Math.abs(target - sum)) {
                res = target - sum;
            }

        }
        return target - res;
    }
}
